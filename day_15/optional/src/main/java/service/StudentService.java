package service;

import exception.NotFoundException;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService {
    //Tạo danh sách
    private List<Student> students;

    public StudentService() {
        students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Thế Anh", "nta@gmail.com"));
        students.add(new Student(2, "Nguyễn Văn Nam", "nvn@gmail.com"));
        students.add(new Student(3, "Đàm Công Vinh", "dcv@gmail.com"));
        students.add(new Student(4, "Bùi Hồng Ngọc", "bhn@gmail.com"));
    }

    //1. In ra danh sách Student
    public void printStudent() {
        if (students.isEmpty()) {
            throw new NotFoundException("List student is empty");
        }
        students.forEach(System.out::println);
    }
    //2. Tim kiếm student theo id
    public Student findStudentById(int id) {
        Optional<Student> optionalStudent = findStudent(id);
        if (optionalStudent.isPresent()) {
            return optionalStudent.get();
        }
        throw new NotFoundException("Can't find student with id = " + id);
    }
    //3. Tìm kiếm student the email
    public Student finStudentByEmail(String email) {
        Optional<Student> optionalStudent = findStudent(email);
        return optionalStudent.orElseThrow(() -> {
            throw new NotFoundException("Can't find student with email is: " + email);
        });
    }
    //4. Xóa student theo id
    public void deleteStudentById(int id) {
        if (findStudent(id).isEmpty()) {
            throw new NotFoundException("Can't find student with id = " + id);
        }
        students.removeIf((s) -> s.getId() == id);
    }

    //Helper Method
    //1. Tìm kiếm học viên theo id -> đối tượng Optional
    public Optional<Student> findStudent(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst();
    }
    //2. Tìm kiếm học viên theo email -> đối tượng Optional
    public Optional<Student> findStudent(String email) {
        return students.stream().filter(s -> s.getEmail().equals(email)).findFirst();
    }
}
