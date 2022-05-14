package demo_interface;

public interface IShape {
    // variable : public, final, static

    String name = "Shape";
    //Method abstract
    double getArea();
    double getPerimeter();
    void printInfo();

    //default method
    default void getSide() {
        System.out.println("Shape has many side ...");
    }

    //Static method
    static void display() {
        System.out.println("Hi there!");
        System.out.println("My name is " + name);
    }
}
