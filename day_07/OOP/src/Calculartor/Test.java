package Calculartor;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.number1 = 10;
        calculator.number2 = 3;

        calculator.printNumber();
        System.out.println(calculator.addNumber());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multi());
        System.out.println(calculator.division());

    }
}
