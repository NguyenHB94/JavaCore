package DemoThis;

public class Test {
    public static void main(String[] args) {

        Student student = new Student("Nguyễn Văn A", 16, Gender.MALE);
        System.out.println(student);
        Student.sayHello();
        System.out.println(Student.school);

    }
}
