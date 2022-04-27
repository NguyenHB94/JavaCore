import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập vào số phần tử của mảng: ");
        int count = sc.nextInt();

        int[] numbersInput = new int[count];
        //Nhập vào từng phần tử của mảng

        for (int i = 0; i < numbersInput.length; i++){
            System.out.println("Nhập vào phần tử thứ " + (i+1) +":");
            numbersInput[i] = sc.nextInt();
        }

        //In ra mảng vừa nhập
        System.out.println("Mảng vừa nhập là: " + Arrays.toString(numbersInput));
    }
}
