package demo_stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 3, 12, 6, 7, 5, 3);
        //Duyệt numbers
        numbers.stream().forEach(System.out::println);
        System.out.println();

        //Tìm các giá trị chẵn trong list
        numbers.stream().filter(s -> s % 2 == 0).forEach(System.out::println);
        System.out.println();

        //Tìm các giá trị > 5 trong list
        numbers.stream().filter(s -> s > 5).forEach(System.out::println);
        System.out.println();

        //Tìm giá trị max trong list
        Optional<Integer> maxOptional = numbers.stream().max((a, b) -> a - b);
        maxOptional.ifPresent(System.out::println);
        System.out.println();

        numbers.stream()
                .sorted(Comparator.comparing(a -> (int)a).reversed())
                .limit(1)
                .forEach(System.out::println);
        System.out.println();

        //Tìm giá trị min trong list
        Optional<Integer> minOptional = numbers.stream().min((a, b) -> a - b);
        minOptional.ifPresent(System.out::println);
        System.out.println();

        numbers.stream()
                .sorted(Comparator.comparing(a -> (int)a))
                .limit(1)
                .forEach(System.out::println);
        System.out.println();

        //Tính tổng các phần tử của mảng
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum + "\n");

        //Lấy danh sách các phần tử không trùng nhau
        numbers.stream().distinct().forEach(System.out::println);
        System.out.println();

        //Lấy 5 phần tử đầu tiên trong mảng
        numbers.stream().limit(5).forEach(System.out::println);
        System.out.println();

        //Lấy phần tử từ thứ 3 -> thứ 5
        numbers.stream().skip(2).limit(3).forEach(System.out::println);
        System.out.println();

        //Lấy phần tử đầu tiên > 5
        Optional<Integer> firstNumberGreater5 = numbers.stream().filter(s -> s > 5).findFirst();
        firstNumberGreater5.ifPresent(System.out::println);
        System.out.println();

        //Kiểm tra xem list có phải là list chẵn hay không
        boolean isListOdd = numbers.stream().allMatch(s -> s % 2 == 0);
        if (isListOdd) {
            System.out.println("List chẵn");
        } else {
            System.out.println("Không phải List chẵn");
        }
        System.out.println();

        //Kiểm tra xem list có phần tử > 10 hay không
        boolean listHasElemetnGreater10 = numbers.stream().anyMatch(s -> s > 10);
        System.out.println(listHasElemetnGreater10 + "\n");

        //Có bao nhiêu phần tử > 5
        long countEmlentGreater5 = numbers.stream().filter(s -> s > 5).count();
        System.out.println(countEmlentGreater5);
        System.out.println();

        //Nhân đôi các phần tủ trong list và trả về list mới
        List<Integer> numbersX2 = numbers.stream().map(s -> s * 2).toList();
        numbersX2.stream().forEach(System.out::println);
        System.out.println();

        //Kiểm tra xem list không chứa giá trị nào = 8 hay không
        boolean listNotContain8 = numbers.stream().noneMatch(s -> s == 8);
        System.out.println(listNotContain8);
    }
}
