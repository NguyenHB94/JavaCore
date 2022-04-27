import java.util.Scanner;

public class MenuTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isContinue = true;
        int option;

        while (isContinue) {

            showMenu();
            System.out.println("Nhập lựa chọn: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1: {
                    System.out.println("Nhập vào chuỗi: ");
                    String str = sc.nextLine();
                    System.out.println(repeatString10time(str));
                    break;
                }
                case 2: {
                    System.out.println("Nhập vào chuỗi: ");
                    String str = sc.nextLine();
                    System.out.println(repeatStringWithDash(str));
                    break;
                }
                case 3: {
                    System.out.println("Nhập vào chuỗi: ");
                    String str = sc.nextLine();
                    System.out.println("Nhập số lần lặp lại:");
                    int count = sc.nextInt();
                    sc.nextLine();
                    System.out.println(repeatStringWithCount(str, count));
                    break;
                }
                case 4: {
                    isContinue = false;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }

            }
        }

    }

    public static String repeatString10time(String str) {
        return str.repeat(10);
    }

    public static String repeatStringWithDash(String str) {
        String result = "";
        for (int i = 0; i < 10; i ++){
            result += str + "-";
        }
        return result.substring(0, result.length() - 1);
    }

    public static String repeatStringWithCount(String str, int count) {
        String result = "";
        for (int i = 0; i < count; i ++){
            result += str + "-";
        }
        return result.substring(0, result.length() - 1);
    }
    public static void  showMenu() {
        System.out.println("1 : Bài 1");
        System.out.println("2 : Bài 2");
        System.out.println("3 : Bài 3");
        System.out.println("4 : Thoát chương trình");
    }
}
