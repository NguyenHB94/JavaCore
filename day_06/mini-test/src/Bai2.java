import java.util.Scanner;

public class Bai2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        String str = sc.nextLine();
        System.out.println("Số từ có trong chuỗi là: ");
        System.out.println(coutnWordsOfString(str));
        countAndPrintIndexOfoInSting(str);


    }

    public static int coutnWordsOfString(String str){
        String[] strArray = str.split(" ");
        int count = strArray.length;
        return count;
    }
    public static void countAndPrintIndexOfoInSting(String str){
        int count = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'o'){
                count++;
                result += i + "\t";
            }
        }
        if (count == 0){
            System.out.println("Chuỗi vừa nhập không chứa ký tự \'o\'");
        } else {
            System.out.println("Vị trí của ký tự \'o\' trong chuỗi là: ");
            System.out.println(result);
            System.out.println("số ký tự \'o\' trong chuỗi là:");
            System.out.println(count);
        }


    }
}
