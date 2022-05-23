package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.Book;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BookService {
    //Lấy thông tin toàn bộ sách
    //Tim sách theo tên
    //Tìm sách theo thể loại
    //Sắp xếp sách theo số trang
    //Sắp xếp sách theo năm xuất bản
    private List<Book> bookList = new ArrayList<>();

    public BookService() {
        getBookList();
    }

    public List<Book> getListObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            // Đọc thông tin từ file và binding và class
            List<Book> books = Arrays.asList(gson.fromJson(reader, Book[].class));

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return books;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<Book> getBookList(){
         return bookList = getListObjectFromJsonFile("book.json");
    }

    //Lấy và in ra thông tin sách
    public void showInfo(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public List<Book> finByName(String title) {
        List<Book> listBookByName = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().contains(title)) {
                listBookByName.add(book);
            }
        }
        return listBookByName;
    }

    public List<Book> findByCategory(String findCategory) {
        List<Book> listBookByCategory = new ArrayList<>();
        for (Book book : bookList) {
            for (String st : book.getCategory()) {
                if (st.equals(findCategory)) {
                    listBookByCategory.add(book);
                }
            }
        }
        return listBookByCategory;
    }

    public List<Book> findByAuthor(String author) {
        List<Book> listBookByAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().contentEquals(author)) {
                listBookByAuthor.add(book);
            }
        }
        return listBookByAuthor;
    }

    public void sortByPageNumber() {
        bookList.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage_number() - o2.getPage_number();
            }
        });

        for (Book b : bookList) {
            System.out.println(b);
        }

    }

    public void sortByReleaseYear() {
        bookList.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getRelease_year() - o2.getRelease_year();
            }
        });

        for (Book b : bookList) {
            System.out.println(b);
        }
    }

}
