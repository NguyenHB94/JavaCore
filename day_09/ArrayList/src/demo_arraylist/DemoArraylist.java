package demo_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //in ra danh sách phần tử
        //1. for
        for (int i = 0; i < numbers.size(); i ++ ) {
            System.out.println(numbers.get(i));
        }
        System.out.println();
        //2. forEach
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
        System.out.println();
        //3. Sử dụng iteratior
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();
        //4.
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + "\t");
        }
        System.out.println();

        //Lambda
        numbers.forEach(number -> System.out.print(number + "\t"));
    }
}
