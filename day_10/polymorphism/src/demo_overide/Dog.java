package demo_overide;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("Dog eat meat ...");
    }

    public void sleep() {
        System.out.println("Dog sleep ...");
    }
}
