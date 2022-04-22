import java.util.Scanner;

public class Calculations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập số b: ");
        int b = scanner.nextInt();

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %f\n", a, b, (double) a / b);
        System.out.printf("%d ^ %d = %d\n", a, b,(int) Math.pow(a,b));
        System.out.printf("%d %% %d = %d", a, b, a % b);//thêm %

    }
}
