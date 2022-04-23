import jdk.swing.interop.SwingInterOpUtils;
enum Role {
    ADMIN, USER, SALE, TEACHER
}


public class EnumDemo {

    //khai báo Enum trong nội bộ class
    enum Gender {

        MALE, FEMALE
    }

    public static void main(String[] args) {

        System.out.println(Gender.MALE);
        System.out.println(Gender.FEMALE);

        System.out.println("Tôi đang là " + Role.ADMIN + " của một trang web");

        System.out.println("Tháng 4 đang là " + Season.SUMMER);

    }

}
