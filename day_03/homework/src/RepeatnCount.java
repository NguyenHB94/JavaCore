import java.util.Scanner;

public class RepeatnCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter strings: ");
        String str = sc.nextLine();
        System.out.println("Please enter count repeat: ");
        int count = sc.nextInt();
        String reapeat = repeatString_(str, count);
        System.out.println("Strings after repeat are: \n" + reapeat);

    }
    public static String repeatString_(String a, int n) {
        String result = "";
//        String aRenew;
        for(int i= 0; i < n; i++) {
//            if (i < (n -1)) {
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
