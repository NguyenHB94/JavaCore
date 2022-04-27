import java.util.Scanner;

public class CheckInputNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while ( true ) {
            System.out.println("Vui lòng nhập vào số bất kỳ: ");
            int number = sc.nextInt();
            if ( number == 0 ) {
                System.out.println("Số phải khác không, vui lòng nhập lại.");

            } else {
                System.out.println("Số vừa nhập là: " + number);
                break;
            }
        }

    }
}
