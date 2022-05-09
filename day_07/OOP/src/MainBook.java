import Model.Book;
import Service.BookService;

public class MainBook {
    public static void main(String[] args) {
        //Khỏi tạo đối tượng
        BookService bookService = new BookService();
        //Danh sách book
        for (Book book: bookService.getBook()){
            System.out.println(book);
        }
    }
}
