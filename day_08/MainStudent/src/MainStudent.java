public class MainStudent {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        Student student = studentService.createStudent();
        System.out.println("Thông tin của học viên là: ");
        studentService.printInfo(student);

    }
}
