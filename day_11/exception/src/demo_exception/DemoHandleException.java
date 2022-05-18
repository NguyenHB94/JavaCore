package demo_exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoHandleException {
    public static void main(String[] args) {
        //Xử lý với try/catch
        //Try : chứa phần code xảy ra lỗi
        //catch : xử lý lỗi neué xảy ra

        try {
            double result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi xảy ra rồi, xủ lý ngay");
            System.out.println(e.getMessage());
        }

        //xử lý nhiều exception
        try {
            double result = 10 / 0;
            System.out.println(result);

            String text = null;
            System.out.println(text.length());
        } catch(RuntimeException e) {
            System.out.println("Lỗi xảy ra rồi xử lý ngay");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Code continue ...");
        }

        //Xử lý ngoại lệ checked

        try {
            File file = new File("text.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi sảy ra khi thao tác với file");
            System.out.println(e.getMessage());
        }

        //Đọc file
//        FileReader fileReader = new FileReader(File);
//        BufferedReader  bufferedReader = new BufferedReader(fileReader);


    }
}
