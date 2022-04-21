public class Bmi {
    public static void main(String[] args) {

        Bmi mi = new Bmi();

        double resultBmi = (double)Math.round((mi.bmi(73.2, 1.73)) * 100 ) / 100;



        System.out.println("Chỉ số BMI của bạn là: " + resultBmi);

    }

    public double bmi(double weight, double height) {

        return (weight / Math.pow(height, 2));

    }
}
