import java.util.Scanner;

public class ConvertString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Xin mời nhập chuỗi: ");
        String str = scanner.nextLine();

        System.out.printf("Chuỗi in hoa của chuỗi vừa nhập là: %s\n", str.toUpperCase());
        System.out.printf("Chuỗi in thường của chuỗi vừa nhập là: %s\n", str.toLowerCase());
        System.out.printf("Số ký tự có trong chuỗi vừa nhập là: %d\n", str.length());
        System.out.printf("Ký tự cuối cùng trong chuỗi vừa nhập là: %c\n", str.charAt(str.length() - 1));
        System.out.printf("5 ký tự đầu của chuỗi vừa nhập là: %s\n", str.substring(0, 6));
        System.out.printf("Chuỗi vừa nhập có chứa chuỗi \"Hello\" hay không: %s", str.contains("Hello"));


    }
}
