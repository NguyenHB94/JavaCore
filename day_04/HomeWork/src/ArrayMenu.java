import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMenu {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr = createArray();
        boolean isContinues  = true;
        int option = 0;
        while (isContinues) {

            showMenu();
            System.out.println("Nhập lựa chọn của bạn: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {

                    System.out.println("Chúc mừng bạn vừa tạo thành công mảng có " + arr.length + " phần tử\n");
                    break;
                }
                case 2: {
                    inputArray(arr);
                    break;
                }
                case 3: {
                    System.out.println("Mảng bạn vừa nhập giá trị cho phần tử là: ");
                    showArray(arr);
                    break;
                }
                case 4: {
                    int[] newArray = changeEvenElementOArray(arr);
                    System.out.println("Mảng sau khi thay đổi là: ");
                    System.out.println(Arrays.toString(newArray));
                    break;
                }
                case 5: {
                    isContinues = false;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không phù hợp");
                    break;
                }
            }
        }

    }
    public static int[] createArray() {
        System.out.println("Nhập vào số phần tử của mảng: ");
        int num = sc.nextInt();
        int [] array = new int[num];
        /*for (int i = 0; i < num; i++) {
            System.out.println((i +1) + ". Nhập vào phần tử thứ " + (i +1)+ " của mảng:");
            array[i] = sc.nextInt();
        }*/
        return array;
    }
    public static int[] inputArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println((i+1) +".Nhập phần tử thứ " + i + " của mảng");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void showArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int[] changeEvenElementOArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] ++;
            }
        }
        return array;
    }

    public static void  showMenu() {
        System.out.println("1. Tạo mảng");
        System.out.println("2. Nhập giá trị cho phần tử của mảng");
        System.out.println("3. In mảng ra màn hình");
        System.out.println("4. Tăng các phần tử chẵn trong mảng lên 1 đơn vị");
        System.out.println("5. Thoát chương trình");
    }

}
