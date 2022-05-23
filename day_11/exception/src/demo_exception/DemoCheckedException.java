package demo_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoCheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        //Khỏi tạo một đối tượng file
        File file = new File("text.txt");

        //Đọc file
        FileReader fileReader = new FileReader(file);
    }
}
