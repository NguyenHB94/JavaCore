package DemoThis;

public class Student {
    public String name;
    public int age;
    public Gender gender;

    // Bắt buộc phải khai báo Constructor rỗng nếu muốn khai báo được Constructor có tham số
    public Student() {
        System.out.println("Constructor defaul");
    }

    public Student(String name) {
        System.out.println("Constructor 1");
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);// Gọi constructor 1
        System.out.println("Constructor 2");
//        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Gender gender) {
        this(name, age);// Gọi constructor 2
        System.out.println("Constructor 3");
//        this.name = name;
//        this.age = age;
        this.gender = gender;
//        sayHello();
//        this.sayHello();
    }

    public static void sayHello(){//"static" thuộc về class không cần tạo đối tượng, gọi trực tiếp từ class
        System.out.println("Hello");
    }

    public static String school = "Lê Quý Đôn";

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
