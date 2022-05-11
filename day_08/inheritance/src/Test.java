public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog("bob", "black", 4);

        System.out.println(dog);

        dog.setColor("white");
        dog.setName("carrot");

        System.out.println(dog);

        dog.eat();



    }
}
