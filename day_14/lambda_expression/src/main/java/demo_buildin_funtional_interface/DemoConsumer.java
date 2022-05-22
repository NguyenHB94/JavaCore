package demo_buildin_funtional_interface;

import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
        List<String> names = List.of("An", "Vinh", "Hòa");

        //Sử dụng lambda
        names.forEach(name -> System.out.println(name));

        //Sử dụng Method reference
        names.forEach(System.out::println);

        //Khai báo consumer
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        names.forEach(consumer);
    }

}
