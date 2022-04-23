public class FinalKeyword {

    public static final int age = 28;

    public static void main(String[] args) {

        final String name = "anna";

        // nên viết hoa khi khai báo hằng số
        final String FIRST_NAME = "bob";

        final double PI;
        PI = 3.14;

        System.out.println(name);
        System.out.println(FIRST_NAME);
        System.out.println(PI);

        // không thể thực hiện gán lại giá trị của hằng số

        //tham chiếu đến biến global

        System.out.println(age);



    }

}
