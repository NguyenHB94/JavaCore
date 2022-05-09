package Service;

import Model.Book;

import java.time.LocalDate;

public class BookService {
    public Book[] getBook(){
        //Tạo ra mảng book
        Book[] books = {
                new Book(1, "Những người khốn khổ", "Bùi Hiên", "tiểu thuyết", "Kim Đồng", 2019),
                new Book(2, "Đắc nhân tâm", "Tô Hoài", "trinh thám", "Tuổi trẻ", 2022),
                new Book(3, "Deep work", "Thu Hằng", "kỹ năng sống", "Phụ nữ", 2021),
                new Book(4, "Rèn luyện tư duy phản biện", "Minh Duy", "tiểu thuyết", "Kim Đồng", 2022),
                new Book(5, "Nghìn lẻ một đêm", "Minh Trí", "trinh thám", "Phụ nữ", 2019),
        };
        //Trả về mảng book sau khi tạo
        return books;
    }

    public void findByTitle(String title){
        int count = 0;
        for (Book book : getBook()) {
            if (book.title.contains(title)) {
                count ++;
                System.out.println(book);
            }
        }

        if (count == 0){
            System.out.println("Không có sách phù hợp với tên là: " + title);
        }
    }
    public void findByCategory(String category){
        int count = 0;
        for (Book book : getBook()) {
            if (book.category.contains(category)) {
                count ++;
                System.out.println(book);
            }
        }

        if (count == 0){
            System.out.println("Không có sách phù hợp với tên là: " + category);
        }
    }

    public void findByPublishingOfYear(int years) {
//        int currentYear = LocalDate.now().getYear();
        int count = 0;
        for (Book book : getBook()) {
            if (book.year == years) {
                count ++;
                System.out.println(book);
            }
        }

        if (count == 0){
            System.out.println("Không có sách xuất bản trong năm: " + years);
        }
    }
}
