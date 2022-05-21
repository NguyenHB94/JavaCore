package controller;

import model.Book;
import service.BookService;

import java.util.List;
import java.util.Scanner;

public class BookController {
    Scanner sc = new Scanner(System.in);
    public final BookService bookService = new BookService();

    public void run() {
        boolean isContinues = true;
        int option = 0;
        while (isContinues) {
            showMenu();
            System.out.println("Nhập vào lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 : {
                    List<Book> bookList = bookService.getBookList();
                    System.out.println("List tất cả sách bao gồm:");
                    bookService.showInfo(bookList);
                    System.out.println();
                    break;
                }
                case 2 : {
                    System.out.println("Nhập tên sách cần tìm kiếm");
                    String title = sc.nextLine();
                    List<Book> bookFindByName = bookService.finByName(title);
                    bookService.showInfo(bookFindByName);
                    break;
                }
                case 3 : {

                    System.out.println("Nhập thể loại");
                    String category = sc.next();
                    List<Book> bookFindByCategory = bookService.findByCategory(category);
                    bookService.showInfo(bookFindByCategory);
                    break;
                }
            }
        }



    }
    public void showMenu() {
        System.out.println("*****Menu*****");
        System.out.println("1. In ra thông tin tất cả sách");
        System.out.println("2. Tìm sách theo tên");
        System.out.println("3. Tìm sách theo thể loại");
        System.out.println("4. Sắp xếp theo số trang");
        System.out.println("5. Sắp xếp theo năm phát hành");
        System.out.println("6. Thoát\n");
    }
}
