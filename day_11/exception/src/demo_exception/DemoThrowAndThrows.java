package demo_exception;

import java.io.IOException;

public class DemoThrowAndThrows {

    public static void main(String[] args) {
        try {
            valiDateAge(20);
            valiDateAge(16);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Code continue ...");
//
//        try {
//            demo();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
   }

    public static void valiDateAge(int age) {
        if (age <18) {
            throw new ArithmeticException("Không đủ tuổi đi nghĩa vụ quân sự");
        }
        System.out.println("Đủ tuổi đi nghĩa vụ quân sự");
    }

//    public static void demo() {
////        throw new IOException("Không tìm thấy file ...");
//    }
}
