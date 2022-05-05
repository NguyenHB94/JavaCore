import java.util.Random;
import java.util.Scanner;

public class Bai5 {
    public static Scanner sc = new Scanner(System.in);
    public static Random rd = new Random();
    public static void main(String[] args) {
        System.out.println("Nhập vào số hàng của mảng: ");
        int m = sc.nextInt();
        System.out.println("Nhập váo số cột của mảng: ");
        int n = sc.nextInt();
        int[][] array = createArray(m, n);
        System.out.println("Mảng vừa nhập là: ");
        printArray(array);
        System.out.println("Các phần tử trên đường chéo chính của mảng vừa nhập là: ");
        printDiagonally(array);
        System.out.println();
        int[][] newArray = createRandomArray(m, n);
        System.out.println("Mảng mới được tạo ngẫu nhiên là: ");
        printArray(newArray);
        int[][] sumArray = sumArray(array, newArray, m, n);
        System.out.println("Tổng của hai mảng là: ");
        printArray(sumArray);

    }
    public static int[][] createArray(int m, int n){

        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.println("Nhập vào giá trị cho phần tử thứ " + (j + 1) + " của hàng thứ " + (i + 1) + ":");
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }
    public static void  printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void  printDiagonally(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (i == j){
                    System.out.print(arr[i][j] + "\t");
                }
            }

        }
    }
    public static int[][] createRandomArray(int m, int n){
        int[][] newArray = new  int[m][n];
        for (int i = 0; i < newArray.length; i++){
            for (int j = 0; j < newArray[i].length; j++){
                newArray[i][j] = rd.nextInt(10);
            }
        }
        return newArray;
    }

    public static int[][] sumArray(int[][] arr1, int[][] arr2,int m, int n){
        int[][] sumArray = new int[m][n];
        for (int i = 0; i < sumArray.length; i++){
            for (int j = 0; j < sumArray[i].length; j++){
                sumArray[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sumArray;
    }
}
