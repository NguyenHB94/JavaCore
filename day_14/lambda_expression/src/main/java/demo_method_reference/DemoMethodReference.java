package demo_method_reference;

import lombok.ToString;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Hello {
    void display();
}

public class DemoMethodReference {
    public static void main(String[] args) {
        //Khởi tạo
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nam", "n@gmail.com"));
        students.add(new Student(2, "An", "a@gmail.com"));
        students.add(new Student(3, "Hưng", "h@gmail.com"));

        //print info
        students.forEach(Student::printInfo);
        System.out.println();
        students.forEach(System.out::println);
        System.out.println();
        students.forEach(student -> System.out.println(student));

        //Sắp xếp
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        students.forEach(System.out::println);
        System.out.println();

        students.sort((s1, s2) -> s2.getName().compareTo(s1.getName()));
        students.forEach(System.out::println);
        System.out.println();

        //Triển khai funtional interface dựa trên method reference
        Student student = new Student(1, "An", "a@gmail.com");
        Hello hello = student::printInfo;
        hello.display();
        System.out.println();

        Hello hello1 = () -> System.out.println(student.getId() + "-" + student.getName() + "-" + student.getEmail());
        hello.display();

    }
}
