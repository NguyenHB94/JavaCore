import java.util.Optional;

public class DemoOptionalMethod {
    public static void main(String[] args) {
        //Tạo đối tượng Optional
        //Optional rỗng
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

        //Optional có giá tri khác rỗng
        Optional<String> stringOptional = Optional.of("Hello");
        System.out.println(stringOptional);

        //Method
        //get() lấy ra giá trị trong Optional
        //isPresent() và ifPresent() : kiểm tra Optional có giá trị hay không
//        if(optionalEmpty.isPresent()) {
//            System.out.println("Giá trị là : " + optionalEmpty.get());
//        } else {
//            System.out.println("Không có giá trị");
//        }

        if(optionalEmpty.isEmpty()) {
            System.out.println("Không có giá trị");
        } else {
            System.out.println("Giá trị là : " + optionalEmpty.get());
        }

        if(stringOptional.isEmpty()) {
            System.out.println("Không có giá trị");
        } else {
            System.out.println("Giá trị là: " + stringOptional.get());
        }

        stringOptional.ifPresent(s -> System.out.println("Giá trị là: " + s));

        //orElse : trả về giá trị của đối tượng Optional nếu giá trị khác rỗng ngược lại trả về giá trị truyền vào
        String value = optionalEmpty.orElse("Default value");
        System.out.println(value);

        String value1 = stringOptional.orElse("Defaul value");
        System.out.println(value1);

        //orElseThrow() : nếu Optional có giá trị thì trả về giá trị đó ngược lại ném ra exception
        try {
            String value2 = optionalEmpty.orElseThrow(() -> {
                throw new RuntimeException("Có lỗi xảy ra");
            });
            System.out.println(value2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
