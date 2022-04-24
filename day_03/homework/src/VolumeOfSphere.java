import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius (centimeter): ");
        double radius = sc.nextDouble();
        double result_volume = volume_of_sphere(radius);
        System.out.printf("Volume of sphere is (cm3): %f", result_volume);

    }

    public static double volume_of_sphere(double r) {
        final double PI = 3.14;
        return 4 * PI * Math.pow(r, 3) / 3;
    }
}
