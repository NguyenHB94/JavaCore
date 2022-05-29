import java.util.Optional;

public class DemoOptional {
    public static void main(String[] args) {
        //Tạo đối tượng Optional
        //Optional rỗng
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);
        System.out.println();

        //Optional có giá tri khác rỗng
        Optional<String> stringOptional = Optional.of("Hello");
        System.out.println(stringOptional);
        System.out.println();

        //Optinal có giá trị cụ thể : có thể null hoặc không
        Optional<Integer> integerOptional = Optional.ofNullable(1);
        System.out.println(integerOptional);
        System.out.println();
        Optional<Integer> integerOptional1 = Optional.ofNullable(null);
        System.out.println(integerOptional1);
    }
}
