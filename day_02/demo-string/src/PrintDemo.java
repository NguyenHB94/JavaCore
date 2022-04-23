public class PrintDemo {
    public static void main(String[] args) {

        System.out.println("My name is Nguyên");

        System.out.print("My name is Nguyên");
        System.out.println("ok OK");

        System.out.printf("My name is %s. I'm %d years old.\n" , "Nguyên", 28);

        System.out.printf("%-20s %-20s %-10s\n", "Họ tên", "Email", "Tuổi");
        System.out.printf("%-20s %-20s %-10d\n", "Nguyễn văn A", "abc@gmail.com", 22);
        System.out.printf("%-20s %-20s %-10d\n", "Nguyễn Văn B", "def@gmail.com", 25);
        System.out.printf("%-20s %-20s %-10d\n", "Nguyễn văn C", "hjk@gmail.com", 29);
    }
}
