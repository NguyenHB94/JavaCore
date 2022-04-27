import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int rdNumber = rd.nextInt(100);

        while (true) {
            System.out.println("Vui lòng chọn số bất kỳ: ");
            int number = sc.nextInt();
            if (number > rdNumber) {
                System.out.println("Bạn chọn số lớn hơn rồi, hãy chọn lại");
            } else if (number < rdNumber) {
                System.out.println("Bạn chọn số nhỏ hơn rồi, hãy chọn lại ");
            }else {
                System.out.println("Chúc mừng bạn đoán trúng rồi.");
                break;
            }
        }

    }
}
