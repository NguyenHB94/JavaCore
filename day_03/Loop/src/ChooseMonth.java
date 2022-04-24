import java.util.Scanner;

public class ChooseMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số ngẫu nhiên từ 1 đến 12: ");
        int month = sc.nextInt();

        switch (month) {
            case 1 :
            case 2 :
            case 3 : {
                System.out.println("Mùa Xuân");
                break;
            }
            case 4 :
            case 5 :
            case 6 : {
                System.out.println("Mùa Hạ");
                break;
            }
            case 7 :
            case 8 :
            case 9 : {
                System.out.println("Mùa Thu");
                break;
            }
            case 10 :
            case 11 :
            case 12 : {
                System.out.println("Mùa Đông");
                break;
            }

            default: {
                System.out.println("Không có mùa phù hợp");
            }
        }
    }
}
