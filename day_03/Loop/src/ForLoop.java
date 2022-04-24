import java.util.Random;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        //Thực hiện công việc lặp đi lặp lại trong vòng 30 ngày
        /*for (int day = 1; day <= 30; day++){
            System.out.println("Ngày" + day + "Thứ dậy lúc 6 giờ");
        }*/

        //Thực hiện lặp lại ngày lẻ
        /*for (int day = 1; day <= 30; day++) {
            if (day % 2 == 1) {
                System.out.println("Ngày" + day + "Thứ dậy lúc 6 giờ");
            }
        }*/
        /*for (int day = 1; day <= 30; day += 2) {
                System.out.println("Ngày " + day + " Thức dậy lúc 6 giờ");
        }*/

        //Break: Kết thúc vòng lặp
        /*for (int day = 1; day <= 30; day++) {
            if (day == 20) {
                System.out.println("Mệt quá rồi, dừng lại thôi");
                break;
            }
            System.out.println("Ngày " + day + " Thức dậy lúc 6 giờ");
        }*/

        //Continue
        /*for (int day = 1; day <= 30; day++) {
            if (day % 7 == 0) {
                System.out.println("Xõa thôi ae :)");
                continue;
            }
            System.out.println("Ngày " + day + " Thức dậy lúc 6 giờ");
        }*/

        //tính tổng tiền tiết kiệm trong vòng 10 ngày, mỗi ngày 100k


        //Random n số ngẫu nhiên trong khoản 0 đến 100 nhập vào từ bàn phím

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Bạn muốn ramdom bao nhiêu số: ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i ++){
            int number_random = rd.nextInt(100);
            System.out.print(number_random + "\t");
        }
    }
}
