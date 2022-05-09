package Calculartor;

public class Calculator {
    public int number1;
    public int number2;

    public void printNumber(){
        System.out.println("Hai số là: " + number1 + " & " + number2);
    }

    public int addNumber() {
        return number1 + number2;
    }

    public int subtract() {
        return number1 - number2;
    }
    public int multi() {
        return number1 * number2;
    }

    public double division() {
        return (double) number1 / (double) number2 ;
    }


}
