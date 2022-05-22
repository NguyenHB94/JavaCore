package demo_lambda;

@FunctionalInterface
interface Hello {
    void sayHello();
}

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class DemoLambda {
    public static void main(String[] args) {
        Hello hello = () -> System.out.println("Chào em");
        hello.sayHello();

        Greeting greeting = (name) -> System.out.println("Xin chào " + name);
        greeting.sayHello("Cu");
    }
}
