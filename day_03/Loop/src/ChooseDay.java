import java.util.Scanner;

public class ChooseDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số ngẫu nhiên từ 0 đến 6: ");
        int number = sc.nextInt();

        switch (number) {
            case 0 : {
                System.out.println("Thứ 2");
                break;
            }
            case 1 : {
                System.out.println("Thứ 3");
                break;
            }
            case 2 : {
                System.out.println("Thứ 4");
                break;
            }
            case 3 : {
                System.out.println("Thứ 5");
                break;
            }
            case 4 : {
                System.out.println("Thứ 6");
                break;
            }
            case 5 : {
                System.out.println("Thứ 7");
                break;
            }
            case 6 : {
                System.out.println("Chủ nhật");
                break;
            }
            default: {
                System.out.println("Không có ngày phù hợp");
            }
        }
    }
}
