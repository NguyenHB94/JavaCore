package demo_overide;

import demo_overload.Calculator;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        //Tạo đối tượng từ lớp Animal
//        Animal animal = new Animal();
//        animal.eat();
//        animal.sound();
//        System.out.println();
//
//        //Tạo đối tượng từ class Dog
//        Dog dog = new Dog();
//        dog.eat();
//        dog.sound();
//        dog.sleep();
//        System.out.println();
//
//        //Tạo đối tượng từ class Cat
//        Cat cat = new Cat();
//        cat.eat();
//        cat.sound();
//        cat.play();

        //Upcasting
        //Éo kiểu không tường minh
        Animal animal = new Dog();

        //Ép kiểu tường minh
        //Animal animal = (Animal) new Dog();

        animal.eat();
        animal.sound();

        //Khỏi tạo từ Class Cat
        Animal animal1 = new Cat();
        animal1.eat();
        animal1.sound();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Cat());


        for (Animal a : animals) {
            a.eat();
            a.sound();
            System.out.println();
        }

        //Downcasting
        Dog dog = (Dog) animal;
        dog.eat();
        dog.sound();
        dog.sleep();

        Cat cat = (Cat) animal1;
        cat.play();
        cat.sound();
        cat.eat();
    }
}
