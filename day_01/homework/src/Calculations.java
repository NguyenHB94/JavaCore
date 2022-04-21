public class Calculations {
    public static void main(String[] args) {

        int a = 10, b = 3;


        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("b - a = " + (b - a));
        System.out.println("a / b = " + ((double) Math.round(((double) a / (double) b) * 100) / 100));
        System.out.println("b / a = " + ((double) b / (double) a));
        System.out.println("a * b = " + (a * b));


    }
}
