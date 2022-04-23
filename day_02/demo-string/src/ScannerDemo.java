import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //Khỏi tạo đối tượng scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên: ");
        String name = sc.nextLine();

        System.out.println("Nhập quê quán: ");
        String address = sc.nextLine();

        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();

        System.out.println("Tôi tên là " + name + ".Năm nay tôi " + age + " tuổi, quê ở " + address);


        //BMI
        System.out.println("Nhập cân nặng (kg): ");
        double weight = sc.nextDouble();

        System.out.println("Nhập chiều cao (m): ");
        double height = sc.nextDouble();
        sc.nextLine();//khắc phục lỗi trôi lệnh khi nhập số trước khi nhập ký tự

        System.out.println("Với weight = " + weight + " và height = " + height + "thì chỉ số BMI = " + bmi(weight, height) );

        System.out.println("Nhập email: ");
        String email = sc.nextLine();

    }

    public static double bmi(double weight, double height) {
        return weight / Math.pow(height, 2);
    }
}
