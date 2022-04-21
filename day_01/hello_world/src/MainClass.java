public class MainClass {
    public static void main(String[] args) {

        System.out.println(Math.PI);

        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));

        System.out.println(Math.abs(-8));
        System.out.println(Math.abs(8));

        //làm tròn xuống
        System.out.println(Math.floor(1.9));
        System.out.println(Math.floor(1.1));
        //làm tròn lên
        System.out.println(Math.ceil(1.9));
        System.out.println(Math.ceil(1.1));
        //làm tròn bình thường
        System.out.println(Math.round(1.9));
        System.out.println(Math.round(1.1));

        //luỹ thừa
        System.out.println(Math.pow(2, 4));
        //căn bậc 2
        System.out.println(Math.sqrt(9));

        //random
        System.out.println(Math.random());//random 1 số trong khoảng (0,1)

        //random 1 số trong khoảng từ 1 đến 10
        int ramdomNumber = (int) Math.floor(Math.random() * 11);
        System.out.println(ramdomNumber);
        //random 1 số trong khoảng từ 10 đến 100
        //công thức ramdom = Math.random() * (max-min +1) + min
        int ramdomNumber1 = (int) Math.floor(Math.random() * (100-10+1) + 10);
        System.out.println(ramdomNumber1);
    }
}
