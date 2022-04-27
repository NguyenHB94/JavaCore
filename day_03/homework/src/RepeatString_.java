import java.util.Scanner;

public class RepeatString_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter strings: ");
        String str = sc.nextLine();
        String reapeat = repeatString_(str);
        System.out.println("Strings after repeat are: \n" + reapeat);

    }

    public static String repeatString_(String a) {
        String result = "";
//        String aRenew;
        for(int i = 0; i < 10; i++) {
//            if (i < (10 -1)) {
//                aRenew = a + "-";
//            }else {
//                aRenew = a;
//            }
//            result = result.concat(aRenew);

            result += a + "-";
        }
        return result.substring(0, result.length() - 1);
    }

}
