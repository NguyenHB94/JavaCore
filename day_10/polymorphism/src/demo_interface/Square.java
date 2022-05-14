package demo_interface;

public class Square implements IShape{

    private double sides;

    public Square() {
    }

    public Square(double sides) {
        this.sides = sides;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    @Override
    public double getArea() {
        return sides * sides;
    }

    @Override
    public double getPerimeter() {
        return sides * 4;
    }

    @Override
    public void printInfo() {
        System.out.printf("side = %2f", sides);
    }
}
