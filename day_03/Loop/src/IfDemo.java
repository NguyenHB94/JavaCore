public class IfDemo {
    public static void main(String[] args) {
        //if
        int hour = 6;
        if (hour < 10) {
            System.out.println("Good morning!");
        }
        //if else
        if (hour < 12) {
            System.out.println("Good morning!");
        } else {
            System.out.println("Good afternoon!");
        }
        //if elseif else
        if (hour < 12) {
            System.out.println("Good morning!");
        } else if (hour >= 12 && hour <= 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good evening!");
        }

        //lồng if else
        int number = -19;
        if (number > 0) {
            System.out.println("Số dương");
            if (number % 2 == 0) {
                System.out.println("Số dương chẵn");
            }else {
                System.out.println("Số dương lẻ");
            }
        } else if (number < 0) {
            System.out.println("Số âm");
        } else {
            System.out.println("số Không");
        }
    }
}
