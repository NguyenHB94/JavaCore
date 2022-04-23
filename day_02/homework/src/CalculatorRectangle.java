import java.util.Scanner;

public class CalculatorRectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter length: ");
        double length = scanner.nextDouble();
        System.out.println("Please enter width: ");
        double width = scanner.nextDouble();

        System.out.printf("The perimeter of the rectagle is: %.2f\n", (length + width) * 2);

        System.out.printf("The area of the rectangle is: %.2f", length * width);

    }

}
