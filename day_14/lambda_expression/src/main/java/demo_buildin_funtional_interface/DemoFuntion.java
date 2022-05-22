package demo_buildin_funtional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DemoFuntion {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("An");
        names.add("Vinh");
        names.add("Hòa");

        names.forEach(System.out::println);
        System.out.println();

        Function<String,String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        names.stream().map(function).forEach(System.out::println);
        System.out.println();

        //Dùng lambda
        names.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
        System.out.println();

        //Dùng method reference
        names.stream().map(String::toUpperCase).forEach(System.out::println);


    }
}
