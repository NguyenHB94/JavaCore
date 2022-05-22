package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Movie;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.*;


public class MovieService {
    List<Movie> movieList = new ArrayList<>();

    public MovieService() {
        movieList = getListObjectFromJsonFile("movie.json");
    }

    public List<Movie> getListObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            //Reader reader = Files.newBufferedReader(Paths.get(fileName));
            FileReader reader = new FileReader(fileName);

            // Đọc thông tin từ file và binding và class
            List<Movie> movies = Arrays.asList(gson.fromJson(reader, Movie[].class));

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return movies;
        } catch (NullPointerException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private void convertObjectToJsonFile(String fileName, Object obj) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            //Writer writer = Files.newBufferedWriter(Paths.get(fileName));
            Writer writer = new FileWriter(fileName);

            gson.toJson(obj, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Đọc file và lấy dữ liệu
    //In thông tin các bộ phim ra màn hình
    //Sắp xếp phim theo tên
    //Sắp xếp phim theo thời lượng
    //Sắp xếp phim theo lượt xem
    //Đếm mỗi thể loại có bao nhiêu bộ phim

    public void showInfo() {
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
        System.out.println();
    }

    public void sortByName() {
        movieList.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
        System.out.println();
    }

    public void sortByLength() {
        movieList.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getLength() - o1.getLength();
            }
        });
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
        System.out.println();
    }

    public void sortByView() {
        movieList.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o2.getView() - o1.getView();
            }
        });
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
        System.out.println();
    }

    public void countMovieByCategry() {
        Set<String> set = new HashSet<>();
        for (Movie movie : movieList) {
            for (String s : movie.getCategory()) {
                set.add(s);
            }
        }

        for (String c : set) {
            int count = 0;
            for (Movie movie : movieList) {
                for (String s : movie.getCategory()) {
                    if (s.equals(c)) {
                        count++;
                    }
                }
            }
            System.out.println("Thể loại " + c + " có " + count + " bộ phim");
        }
        System.out.println();
    }
}
