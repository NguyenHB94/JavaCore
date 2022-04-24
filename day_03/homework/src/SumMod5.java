import java.util.Scanner;

public class SumMod5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter number limit: ");
        int number_limit = sc.nextInt();
        int sum_mod_5 = sumMod5(number_limit);
        System.out.println("The Sum is: " + sum_mod_5);

    }

    public static int sumMod5(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++){
            if (i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
