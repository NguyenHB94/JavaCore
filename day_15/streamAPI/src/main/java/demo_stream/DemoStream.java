package demo_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) {
        //Một số cách để tạo stream
        //cách1: sử dụng Stream.of()
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

        //Cách2: sử dụng Stream.builder()
        Stream<String> stringStream = Stream.<String>builder()
                .add("Nam")
                .add("An")
                .add("Khánh")
                .build();

        //cách 3: sử dụng range
        IntStream intStream = IntStream.range(1,10);

        //Cách 4: sử dụng Array.Stream
        int[] numbers1 = {1, 2, 3, 4, 5, 6};
        IntStream intStream1 = Arrays.stream(numbers1);

        //Cách 5: Tạo stream từ Collection
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        Stream<Integer> integerStream = integerList.stream();
    }
}
