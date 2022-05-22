package demo_buildin_funtional_interface;

import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoPredicate {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("An");
        names.add("Vinh");
        names.add("Hòa");

        names.forEach(System.out::println);
        System.out.println();

        //Xóa 1 name tên An
        names.removeIf(name -> name.equals("An"));
        names.forEach(System.out::println);
        System.out.println();

        //Dùng Predicate
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.equals("Hòa");
            }
        };

        names.removeIf(predicate);
        names.forEach(System.out::println);
        System.out.println();

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> result = getNUmberIsOdd(list,(a) -> a % 2 == 1);
        result.forEach(System.out::println);


    }

    public static List<Integer>  getNUmberIsOdd(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> list = new ArrayList<>();

        for (Integer n : numbers) {
            if(predicate.test(n)) {
                list.add(n);
            }
        }
        return list;


    }
}
