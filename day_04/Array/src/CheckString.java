import java.util.Locale;
import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập chuỗi cần kiểm tra: ");
        String strCheck = sc.nextLine();
        boolean resultCheck = checkSymmetricString(strCheck);
        System.out.println("Chuỗi vừa nhập có phải là chuỗi đối xứng? " + resultCheck);

    }
    public static boolean checkSymmetricString(String str){

        String strRemoveSpace = str.replaceAll("\\s", "");
        String strConvert = strRemoveSpace.toLowerCase(Locale.ROOT);
        boolean result;
        int count = 0;
        int num = strConvert.length() / 2;
        for (int i = 0; i < num ; i++) {
            if (strConvert.charAt(i) == strConvert.charAt(strConvert.length() - 1 - i)) {
                count ++;
            }
        }
        result = count == num;
        return result;
    }
}
