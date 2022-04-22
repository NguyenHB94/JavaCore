public class Main {
    public static void main(String[] args) {
        //Khai báo kiểu literal
        String name = "Lê Nguyên";
        String name1 = "Lê Nguyên";

        //Khai báo bằng cách tạo từ khoá new -> sinh ra đối tượng
        // Khởi tạo = từ khóa new -> Sinh ra đối tượng
        String message = new String("Xin chào");
        String message1 = new String("Xin chào");

        System.out.println(name);
        System.out.println(message);

        // == thường được sử dụng cho kiểu dữ liệu nguyên thuỷ
        System.out.println(name == name1);
        System.out.println(message == message1);

        // equals so sánh về mặt ký tự

        System.out.println(name.equals(name1));
        System.out.println(message.equals(message1));

        //Method String
        String text = "Xin chào các bạn";

        System.out.println("in hoa chữ : " + text.toUpperCase());
        System.out.println("in thường chữ : " + text.toLowerCase());

        System.out.println("độ dài chữ : " + text.length());

        System.out.println("ký tự đầu của chuỗi : " + text.charAt(0));
        System.out.println("ký tự cuối của chuỗi : " + text.charAt(text.length() - 1));

        System.out.println("chuỗi hi có chỉ số bắt đầu là : " + text.indexOf("hi"));
        System.out.println("chuỗi ch có chỉ số bắt đầu là : " + text.indexOf("ch"));

        System.out.println("chuỗi hi có tồn tại trong chuỗi ban đầu không? " + text.contains("hi"));
        System.out.println("chuỗi ch có tồn tại trong chuỗi ban đầu không? " + text.contains("ch"));

        System.out.println("cắt chuỗi Xin : " + text.substring(0,3));
        System.out.println("cắt chuỗi chào các bạn : " + text.substring(4));


    }

}
