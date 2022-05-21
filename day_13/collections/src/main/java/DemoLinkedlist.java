import java.util.Deque;
import java.util.LinkedList;

public class DemoLinkedlist {
    public static void main(String[] args) {
        Deque<Integer> numbers = new LinkedList<>();
        numbers.add(2);
        numbers.add(10);
        numbers.add(7);
        numbers.add(4);

        for (int n : numbers) {
            System.out.println(n);
        }

        numbers.addFirst(5);
        numbers.addLast(12);
        System.out.println(numbers.toString());
    }
}
