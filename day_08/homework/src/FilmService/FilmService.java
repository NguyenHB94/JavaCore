package FilmService;

import Film.Movie;
import Film.Serial;

import java.util.Scanner;

public class FilmService {

    Scanner sc = new Scanner(System.in);
//    Khai báo kiểu dưới đã đổi kiểu tra về là void vẫn bị lỗi
//    public Film.Movie[] movies;
//    public Film.Serial[] serials;

    public Movie[] getMovie(){
        Movie[] movies = {
                new Movie(1, "Doctor Strange in the Multiverse of Madness", "Action, Adventure, Fantasy", "Sam Raimi", "May 4, 2022", "126 minutes"),
                new Movie(2, "Extremely Easy Job", "Action, Comedy", "Võ Thanh Hòa", "Apr 29, 2022", "113 minutes"),
                new Movie(3, "Fast & Feel Love", "Comedy, Romance", "Nawapol Thamrongrattanarit", "Apr 29, 2022", "131 minutes"),
                new Movie(4, "Haunted Tales", "Horror", "Suphakorn Riansuwan", " Apr 29, 2022", "98 minutes"),
                new Movie(5, "Sonic The Hedgehog 2", "Action, Adventure", "Jeff Fowler", "Apr 15, 2022", "122 minutes"),
        };
        return movies;
    }

    public Serial[] getSerial(){
        Serial[] serials = {
                new Serial(1, "Rose Mansion", "Psychological, Thriller", "Chang", "May 13, 2022",16, "60 minutes"),
                new Serial(2, "Bloody Heart", "Historical, Psychological, Romance", "Yoo Young Eun", "May 2, 2022",16, "60 minutes"),
                new Serial(3, "Halo", "War, Horror, Fiction, Action", "Steven Kane", "April 23, 2022",9, "50 minutes"),
                new Serial(4, "Love All Play", "Romance, Drama, Sports", "Jo Woong", "April 20, 2022",16, "70 minutes"),
                new Serial(5, "China Special Forces", "Action, Psychological", "Tu Ji Chau", "April 5, 2022",45, "45 minutes"),
        };
        return serials;
    }

    public void showInfo() {
        System.out.println("Film.Movie: ");
        for (Movie movie : getMovie()) {
            System.out.println(movie.toString());
        }

        System.out.println("Film.Serial: ");
        for (Serial serial : getSerial()) {
            System.out.println(serial.toString());
        }
    }

    public void findByTitle() {
        System.out.println("nhập vào phim bạn muốn tìm kiếm: ");
        String titleFilm = sc.nextLine();
        int count = 0;
        for (Movie movie : getMovie()){
            if (movie.getTitle().contains(titleFilm)){
                count ++;
                System.out.println(movie.toString());
            }
        }
        for (Serial serial : getSerial()) {
            if (serial.getTitle().contains(titleFilm)) {
                count ++;
                System.out.println(serial.toString());
            }
        }

        if (count == 0) {
            System.out.println("Không có phim tên là: " + titleFilm);
        }
    }

    public void findByGenre() {
        System.out.println("nhập vào thể loại phim bạn muốn tìm kiếm: ");
        String genreFilm = sc.nextLine();
        int count = 0;
        for (Movie movie : getMovie()){
            if (movie.getGenre().contains(genreFilm)){
                count ++;
                System.out.println(movie.toString());
            }
        }
        for (Serial serial : getSerial()) {
            if (serial.getGenre().contains(genreFilm)) {
                count ++;
                System.out.println(serial.toString());
            }
        }

        if (count == 0) {
            System.out.println("Không có phim tên là: " + genreFilm);
        }
    }
}
