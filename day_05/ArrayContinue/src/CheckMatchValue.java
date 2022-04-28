import java.util.Scanner;

public class CheckMatchValue {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Nhập vào số phần tử của mảng: ");
        int num = sc.nextInt();
        int[] arr = createArray(num);
        System.out.println("Nhập vào giá trị cần tìm kiếm:");
        int number = sc.nextInt();
        boolean resultCheck = checkMatchValue(arr, number);
//        if (resultCheck == true){
//            System.out.println("Giá trị cần tìm kiếm không có trong mảng");
//        } else {
//            System.out.println("Giá trị cần tìm kiếm có trong mảng");
//        }
        System.out.println("Giá trị cần tìm kiếm có trong mảng hay không? " + resultCheck);



    }
    public static int[] createArray(int n){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Nhập vào phần tử thứ " + (i +1) + " của mảng");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static boolean checkMatchValue(int[] arr, int number){
        boolean result = false;
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] == number){
                result  =true;
                break;
            }
        }
        return result;
    }
}
