import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào email của bạn: ");
        String email = sc.nextLine();
        System.out.println("Nhập vào số điện thoại của bạn: ");
        String phoneNumbers = sc.nextLine();
        if (checkSyntaxEmail(email)){
            System.out.println("Email vừa nhập hợp lệ.");
        } else {
            System.out.println("Email vừa nhập không hợp lệ");
        }
        if (checkPhoneNumber(phoneNumbers)){
            System.out.println("Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại vừa nhập không hợp lệ");
        }

    }
    public static boolean checkSyntaxEmail(String email){
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

        boolean result = Pattern.matches(EMAIL_PATTERN, email);
        return result;
    }
    public static boolean checkPhoneNumber(String number){
        String PHONENUMBERS_PATTERN = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
        boolean result = Pattern.matches(PHONENUMBERS_PATTERN, number);
        return result;
    }
}
