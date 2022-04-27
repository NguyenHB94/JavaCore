import java.util.Scanner;

public class CopyStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần copy: ");
        String str = sc.nextLine();
        String result_repeat = repeatStrings(str);
        System.out.println("Chuỗi sau khi copy là:\n" + result_repeat);

    }
    // có thể sử dụng phương thức có sẵn name.repeat
    public static String repeatStrings(String a) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 10; i++){
//            result = result.concat(a);
            // result += a;
            result.append(a);
        }

        return result.toString();

    }

}
