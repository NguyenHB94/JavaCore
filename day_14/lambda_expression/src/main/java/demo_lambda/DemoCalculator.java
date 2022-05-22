package demo_lambda;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class DemoCalculator {

    public static void main(String[] args) {
        //Cộng 2 số
        Calculator add = (a, b) -> a + b;
        System.out.println(add.calculate(2, 3));

        Calculator subtract = (a, b) -> a - b;
        System.out.println(subtract.calculate(5, 2));

    }
}
