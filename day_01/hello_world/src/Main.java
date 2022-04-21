public class Main {
    //biến global
    public static int globalVariable = 20;

    public static void main(String[] args) {
        {
            //biến local
            int localVariable = 20;
        }

        //Chương trình đầu tiên
        System.out.println("Hello World!");

        //Khai báo biến
        String first_name;
        String last_name;
        //tạo giá trị cho biến
        first_name = "Lê";
        last_name = "Nguyên";
        //in ra biến
        System.out.println(first_name);
        System.out.println(last_name);

        //vừa khai báo biến vừa khởi tạo giá trị cho biến
        String full_name = first_name + " " + last_name;

        System.out.println(full_name);
        //kiểu số nguyên
        int age = 28;

        System.out.println("Xin chào các bạn, tôi tên là " + full_name + ". Mình sinh năm " + (2022 - 28)
                + " và năm nay mình " + age + " tuổi");
        //kiểu long
        long money = 2_000_000_00L;
        System.out.println(money);
        //kiểu boolean
        boolean is_married = false;
        System.out.println("is_married = " + is_married + " là chưa lấy vợ nhé.");
        System.out.println("is_married = " + !is_married + " là đã lấy vợ nhé.");

        float weight = 72.5f;
        double height = 1.73;

        System.out.println("cân nặng = " + weight);
        System.out.println("chiều cao = " + height);

        int number = 10;
        long number1 = number;
        double number2 = number;

        //ép kiểu
        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);
        //ép kiểu tường mình

        double height_value = 1.8;
        int height_value_convert = (int) height_value;
        System.out.println(height_value_convert);

    }
}
