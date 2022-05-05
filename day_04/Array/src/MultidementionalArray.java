import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class MultidementionalArray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[][] arr = createMultiArray();
        System.out.println("Mảng vừa nhập là: ");
        for (int[] row : arr){
            for (int x : row){
                System.out.print(x + "\t");
            }
            System.out.println();
        }
        System.out.println("Tổng các phần tử chẵn trong mảng là: ");
        int sum = sumEventOfArray(arr);
        System.out.println(sum);
        System.out.println("Phần tử lớn nhất của mảng là: ");
        int max = findMaxOfArray(arr);
        System.out.println(max);
        finMaxRowOfArray(arr);

    }
    public static int[][] createMultiArray(){
        System.out.println("Nhập và số hàng: ");
        int row = sc.nextInt();
        System.out.println("Nhập vào số cột: ");
        int colume = sc.nextInt();
        int[][] array = new int[row][colume];
        for (int i = 0; i < row; i++){
            for (int j = 0; j <colume; j++){
                System.out.println("Nhập giá trị cho phần tử thứ " + (j + 1) + " hàng " + (i + 1) + ": ");
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }
    public static int sumEventOfArray(int[][] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] % 2 == 0){
                    result += arr[i][j];
                }
            }
        }
        return result;
    }
    public static int findMaxOfArray(int[][] arr) {
        int result = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > result){
                    result = arr[i][j];
                }
            }
        }
        return result;
    }
    public static void finMaxRowOfArray(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            int result = arr[i][0];
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > result){
                    result = arr[i][j];
                }
            }
            System.out.println("Phần tử lớn nhất của hàng thứ " + (i +1) + " là: " + result);
        }
    }
}
