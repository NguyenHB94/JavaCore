package practice;

public class TestStudent {

    public static void main(String[] args) {
        Student student = new Student();

        student.setId("Abc12345");
        student.setAge(18);
        student.setAvgPoint(9.2);
        student.setClassroom("C15");

        System.out.println("Thông tin sinh viên là: ");
        System.out.println(student);

        student.checkStudentShip();

        Student student1 = new Student("A1234567", 8.8, 24, "A22");

    }
}
