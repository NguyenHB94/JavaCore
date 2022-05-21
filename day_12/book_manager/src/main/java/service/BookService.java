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
import java.util.List;

public class BookService {
    //Lấy thông tin toàn bộ sách
    //Tim sách theo tên
    //Tìm sách theo thể loại
    //Sắp xếp sách theo số trang
    //Sắp xếp sách theo năm xuất bản
    private List<Book> bookList;

    public BookService() {
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

    public void convertObjectToJsonFile(String fileName, Object obj) {
        try {
            // Tạo đối tượng gson
            // Gson gson = new Gson();

            // Nếu muốn format JSON cho đẹp
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Tạo đối tượng Writer để ghi nội dung vào file
            Writer writer = Files.newBufferedWriter(Paths.get(fileName));

            // Ghi object vào file
            gson.toJson(obj, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Book> getBookList(){
        bookList = getListObjectFromJsonFile("book.json");
        return bookList;
    }

    //Lấy và in ra thông tin sách
    public void showInfo(List<Book> books) {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    public List<Book> finByName(String title) {
        getBookList();
        List<Book> listBookByName = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitle().contains(title)) {
                listBookByName.add(book);
            }
        }
        return listBookByName;
    }

    public List<Book> findByCategory(String category) {
        getBookList();
        List<Book> listBookByCategory = new ArrayList<>();
        for (Book book : bookList) {
            for (String st : book.getCategory()) {
                if (st.contains(category)) {
                    listBookByCategory.add(book);
                }
            }
        }
        return listBookByCategory;
    }

    public List<Book> findByAuthor(String author) {
        getBookList();
        List<Book> listBookByAuthor = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().contains(author)) {
                listBookByAuthor.add(book);
            }
        }
        return listBookByAuthor;
    }

    public List<Book> sortByPageNumber() {
        getBookList();
    }

}
