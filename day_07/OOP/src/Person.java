import java.time.LocalDate;

public class Person {
    //Khai báo thuộc tính
    public String name;
    public int age;
    public String address;

    //Khỏi tạo constructor mặc định

    public Person() {
        System.out.println("Constructor mặc định được gọi");
    }

    public Person(String name) {
        this.name = name;
    }

    //Khỏi tạp constructor 2 tham số
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor 2 tham số được gọi");
    }
    //Khỏi tạo constructor 3 tham số


    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("Constructor full tham số được gọi");
    }

    //Khai báo phương thức
    public void  play() {
        System.out.println("Đang chơi game ...");
    }

    public void eat(String foodName) {
        System.out.println("Đang ăn " + foodName);
    }

    public int getYearOfBirth() {
        return LocalDate.now().getYear() - age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
