package demo_interface;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        //Khỏi tạo Interface từ class Rectangle
        IShape shape = new Rectangle(5.5, 6.6);
        shape.printInfo();
        System.out.println();
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());

        System.out.println();
        //Khỏi tạo Interface từ class Square
        IShape shape1 = new Square(4);
        shape1.printInfo();
        System.out.println();
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());

        //Khỏi tạo mảng
        ArrayList<IShape> iShapes = new ArrayList<>();
        iShapes.add(shape);
        iShapes.add(new Rectangle(6, 8));
        iShapes.add(shape1);
        iShapes.add(new Square(6));

        int totalArea;
        int totalPremeter;

        ArrayList<IShape> listRectangle = new ArrayList<>();
        for (IShape iShape : iShapes) {
            if(iShape instanceof Rectangle) {
                listRectangle.add(iShape);
            }
        }
        for (IShape iShape : listRectangle) {
            System.out.println(iShape);
        }

        System.out.println();
        listRectangle.sort(new Comparator<IShape>() {
            @Override
            public int compare(IShape o1, IShape o2) {
                return (int) (o1.getArea() - o2.getArea());
            }
        });
        for (IShape iShape : listRectangle) {
            System.out.println(iShape);
        }

    }
}
