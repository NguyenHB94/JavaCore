import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //Khai báo sau đó gắn giá trị cho mảng
        int[] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(numbers[numbers.length - 1]);

        //Vừa khai báo vừa khỏi tạo giá trị cho mảng

        int[] numbersOther = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbersOther));
        System.out.println(numbersOther.length);
        System.out.println(numbersOther[3]);

        //Duyệt mảng
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();

        //While
        int j = 0;
        while (j < numbers.length) {
            System.out.print(numbers[j] + "\t");
            j++;
        }
        System.out.println();
        //forEach
        for (int number : numbers) {
            System.out.print(number + "\t");
        }

        //Tính tổng
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("\nTổng = " + total);

        //TÌm giá trị lớn nhất trong mảng
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max){
                max = number;
            }
        }
        System.out.println("Max = " + max);

        //Sắp xếp phần tử mảng
        Arrays.sort(numbers);
        System.out.println("Max = " + numbers[numbers.length - 1]);
    }
}
