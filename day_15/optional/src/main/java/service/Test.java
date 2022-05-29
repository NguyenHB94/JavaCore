package service;

import exception.NotFoundException;
import model.Student;

public class Test {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        //in ra thông tin học viên
        try {
            studentService.printStudent();
            System.out.println();
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        //TÌm học viên theo Id
        try {
            Student student1 = studentService.findStudentById(1);
            System.out.println(student1);

            Student student2 = studentService.findStudentById(5);
            System.out.println(student2);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        //Tìm học viên theo email
        try {
            Student student3 = studentService.finStudentByEmail("nvn@gmail.com");
            System.out.println(student3);

            Student student4 = studentService.finStudentByEmail("acb@gmail.com");
            System.out.println(student4);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        //Xóa học viên theo Id
        try {
            studentService.deleteStudentById(1);
            studentService.printStudent();

            studentService.deleteStudentById(5);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }



    }

}
