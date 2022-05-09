package DemoClass;

public class Test {
    public static void main(String[] args) {
        //Tạo đối tượng
        Person person = new Person();

        //Gán giá trị cho đối tượng;
        person.name = "Lê Nguyên";
        person.age = 28;
        person.address = "Hòa Bình";

        //In ra thông tin
        System.out.println(person.name + "-" + person.age + "-" + person.address);
        System.out.println(person);

        //Gọi phương thức
        person.play();
        person.eat("PHỞ");
        System.out.println(person.getYearOfBirth());
        
        //Khỏi tạo đối tượng 1 tham số
        Person person1 = new Person("Nguyễn Văn A");

        //Khỏi tạo đối tượng 2 tham số
        Person person2 = new Person("Nguyễn Văn A", 40);

        //Khỏi tạo đối tượng 3 tham số
        Person person3 = new Person("Nguyễn Văn A", 40, "Hồ Chí Minh");
        

    }
}
