package demo_exception;

import java.io.*;

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

            //Khỏi tạo đối tượng file
            File file = new File("text.txt");
            //Đọc file
            FileReader fileReader = new FileReader(file);
            BufferedReader  bufferedReader = new BufferedReader(fileReader);

//            String s;
//            while ((s = bufferedReader.readLine()) != null) {
//                System.out.println(s);
//            }

            for (int i = 0; i < 2; i++) {
                System.out.println(bufferedReader.readLine());
            }

        } catch (IOException e) {
            System.out.println("Lỗi sảy ra khi thao tác với file");
            System.out.println(e.getMessage());
        }




    }
}
