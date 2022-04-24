import java.util.Scanner;

public class Compare2Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập vào số b: ");
        double b = sc.nextDouble();
        double big = compare(a, b);
        System.out.printf("Số lơn hơn là: %.2f", big);

    }
    public static double compare(double a, double b) {
        double result;
        if( a > b){
            result = a;
        }else {
            result = b;
        }

        return result;

    }
}
