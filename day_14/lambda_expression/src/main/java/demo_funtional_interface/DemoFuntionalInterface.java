package demo_funtional_interface;

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}
// Cách 1: Sử sụng class implement interface
public class DemoFuntionalInterface implements  Greeting{
    @Override
    public void sayHello(String name) {
        System.out.println("Xin chào " + name);
    }

    public static void main(String[] args) {
        //Khai báo interface sử dụng class implements
        Greeting greeting = new DemoFuntionalInterface();
        greeting.sayHello("em gái");

        //Cách 2: sử dụng anonymous class
        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Xin chào " + name);
            }
        };
        greeting1.sayHello("em gái");
    }
}
