import java.util.Scanner;

public class ShowIn4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your address: ");
        String add = scanner.nextLine();
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("please enter your gender: ");
        String gender = scanner.nextLine();
        System.out.printf("Hi everyone, my name is %s, i'm %d years old, my gender is %s. Now i'm living in %s", name, age, gender, add);
    }
}
