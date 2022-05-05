import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số cần kiểm tra: ");
        int n =sc.nextInt();
//        boolean result = checkPrimeNumber(n);
        if (checkPrimeNumber(n)){
            System.out.println("Số vừa nhập là số nguyên tố");
        } else {
            System.out.println("Số vừa nhập không phải là số nguyên tố");
        }

    }
    public static boolean checkPrimeNumber(int n){
        if (n < 2){
            return false;
        }
        int countlimit = (int)Math.sqrt(n);
        for (int i = 2; i <= countlimit; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
