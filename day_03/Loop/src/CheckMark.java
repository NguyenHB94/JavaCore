import java.lang.reflect.Method;
import java.util.Scanner;

public class CheckMark {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int mark_input = scanner.nextInt();

        String resul_check = check(mark_input);
        System.out.println(resul_check);


    }
    public static String  check(int mark){
        String result;
        if (mark >= 85) {
            result = "A";
        } else if (mark < 85 && mark >= 70) {
            result = "B";
        } else if (mark < 70 && mark >= 40) {
            result = "C";
        } else {
            result = "D";
        }
        return result;
    }


}
