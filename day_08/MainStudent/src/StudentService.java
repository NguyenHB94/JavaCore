import java.util.Random;
import java.util.Scanner;

public class StudentService {
    public Scanner sc = new Scanner(System.in);

    public Random rd = new Random();

    public Student createStudent(){

        int id = rd.nextInt(1,100);

        System.out.println("Nhập vào tên học viên: ");
        String name = sc.nextLine();

        System.out.println("Nhập vào điểm lý thuyết: ");
        double theoryPoint = sc.nextDouble();

        System.out.println("Nhập vào điểm thực hành: ");
        double practicePoint = sc.nextDouble();

        Student student = new Student(id, name, theoryPoint, practicePoint);

        return student;
    }

    public double caculateAvgPoint(double theoryPoint, double practicePoint){

        double avgPoint = (theoryPoint + practicePoint) / 2;

        return avgPoint;

    }

    public void printInfo(Student s){

        System.out.println("Id: " + s.id + "\tName: " + s.name + "\tĐiểm lý thuyết: " + s.theoryPoint + "\tĐiểm thực hành: " + s.practicePoint + "\tĐiểm trung bình: " + caculateAvgPoint(s.theoryPoint, s.practicePoint)  );

    }



}
