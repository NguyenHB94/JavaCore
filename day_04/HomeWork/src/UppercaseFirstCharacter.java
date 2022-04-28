import java.util.Scanner;

public class UppercaseFirstCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String name = sc.nextLine();
        System.out.println("Your full name is: " + uppercaseFirstCharacter(name));

    }
    public static String uppercaseFirstCharacter(String str) {
        String[] strArr = str.split(" ");
        String strConvert = "";
        for (String word : strArr) {
            strConvert += word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            strConvert += " ";
        }
        return strConvert.substring(0, strConvert.length() - 1);
    }
}
