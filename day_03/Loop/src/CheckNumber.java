import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra: ");
        int number = sc.nextInt();
        String result_check = checknumber(number);
        System.out.printf("Số vừa nhập vào là %s", result_check);

    }
    public static String checknumber(int a){
        String result;
        if (a >0){
            result = "Số dương";
        } else if (a < 0) {
            result = "Số âm";
        } else {
            result = "Số 0";
        }
        return result;
    }
}
