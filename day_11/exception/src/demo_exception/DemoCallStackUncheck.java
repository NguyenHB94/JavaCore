package demo_exception;

public class DemoCallStackUncheck {
    public static void main(String[] args) {
        methodThree();

        System.out.println("code continue ...");
    }
    public static void methodOne() {
        throw new ArithmeticException("lỗi toán học");
    }

    public static void methodTwo(){
        methodOne();
    }

    public static void methodThree() {
        try {
            methodTwo();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
