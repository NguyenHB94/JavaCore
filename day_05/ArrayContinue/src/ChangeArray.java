import java.util.Scanner;

public class ChangeArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập vào số phần tử của mảng: ");
        int num = sc.nextInt();
        int[] arr = changeArray(num);

        showArray(arr);

    }
    public static int[] changeArray(int n) {

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i ++) {
            System.out.println("Nhập vào phần tử thứ " + (i+1) + " của mảng:");
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < arr.length; j ++) {
            arr[j] %=  2;
        }
        return arr;
    }
    public static void  showArray(int[] arr) {
        System.out.println("Mảng sau khi thay đổi là:");
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + "\t");
        }
    }

}
