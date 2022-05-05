import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int number = rd.nextInt();
//        boolean result = checkPrimeNumber(n);
        if (checkPrimeNumber(number)){
            System.out.println("Số vừa được tạo ngẫu nhiên là: " + number + " là số nguyên tố");
        } else {
            System.out.println("Số vừa được tạo ngẫu nhiên là: " + number + " không phải là số nguyên tố");
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
