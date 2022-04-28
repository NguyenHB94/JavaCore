import java.util.Scanner;

public class RepeatString10Time {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần copy: ");
        String str = sc.nextLine();

        System.out.println("Chuỗi sau khi thực hiện copy là: ");
        System.out.println(repeatString10Time(str));


    }

    public static String repeatString10Time(String str){
        String[] arr = new String[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = str;
        }
        return String.join("",arr);
    }
 }
