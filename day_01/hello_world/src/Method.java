public class Method {
    public static void main(String[] args) {
        Method mt = new Method();
        mt.sayHello();
        mt.sayHelloWithName("Lê Nguyên");//Argument : Đối số

        int data = mt.sum(12, 15);
        System.out.println(data);
        System.out.println(mt.sum(3, 4));
    }

    public void sayHello() {
        System.out.println("Xin chào các bạn");
    }
    public void sayHelloWithName(String name) { // name là Parameter : Tham số
        System.out.println("Xin chào " + name);
    }

    public int sum(int a, int b) {

        return a + b;

    }
}
