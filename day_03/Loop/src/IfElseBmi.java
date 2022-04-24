import java.util.Scanner;

public class IfElseBmi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập cân nặng: ");
        double weight = sc.nextDouble();
        System.out.println("Nhập chiều cao: ");
        double height = sc.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18.5) {
            System.out.println("Thiếu cân");
        } else if (bmi >= 18.5 && bmi <=24.9) {
            System.out.println("Bình thường");
        } else {
            System.out.println("Thừa cân");
        }

    }
}
