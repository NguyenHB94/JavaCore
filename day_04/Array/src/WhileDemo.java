import java.util.Random;

public class WhileDemo {
    public static void main(String[] args) {

 /*       int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;*/
//            System.out.println(i++);
        Random re = new Random();

        while (true) {

            int rdNumber = re.nextInt(100);
            System.out.print(rdNumber + "\t");
            if (rdNumber > 90) {
                break;
            }

        }

    }
}
