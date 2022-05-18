package demo_exception;

import java.io.IOException;

public class DemoCallStackCheck {
    public static void main(String[] args) {
        methodThree();

        System.out.println("code continue ...");
    }
    public static void methodOne() throws IOException {
        throw new IOException("Không tìm thấy file");
    }

    public static void methodTwo() throws IOException {
        methodOne();
    }

    public static void methodThree() {
        try {
            methodTwo();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
