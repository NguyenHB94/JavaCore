import Model.Book;
import Service.BookService;

import java.util.Scanner;

public class MainBook {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Khỏi tạo đối tượng
        BookService bookService = new BookService();
        //Danh sách book
//        for (Book book: bookService.getBook()){
//            System.out.println(book);
//        }
        boolean isContinue = true;

        while (isContinue){
            showMenu();
            System.out.println("Nhập lựa chọn của bạn: ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1: {
                    System.out.println("Nhập tên sách cần tìm kiếm: ");
                    String title = sc.nextLine();
                    bookService.findByTitle(title);
                    break;
                }

                case 2: {
                    System.out.println("Nhập thể loại sách cần tìm kiếm: ");
                    String category = sc.nextLine();
                    bookService.findByCategory(category);
                    break;
                }

                case 3: {
                    System.out.println("Nhập năm xuất bản sách: ");
                    int years = sc.nextInt();
                    bookService.findByPublishingOfYear(years);
                    break;
                }

                case 4: {
                    isContinue = false;
                    break;
                }

                default: {
                    System.out.println("Lựa chọn không phù hợp");
                    break;
                }


            }

        }
    }
    public static void showMenu(){
        System.out.println("1. Tìm sách theo tên.");
        System.out.println("2. Tìm sách theo thể loại.");
        System.out.println("3. Tìm sách theo năm xuất bản.");
        System.out.println("4. Thoát tìm kiếm.");
    }
}
