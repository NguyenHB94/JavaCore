package service;

import controller.StudentController;
import model.Student;

import java.lang.reflect.Array;
import java.util.*;

public class StudentServiceImpl implements IStudentService {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);
    private ArrayList<Student> students;

    public StudentServiceImpl() {
        init();
    }

    public void init() {
        students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Trọng Đại", 19, "Hà Nội", 8.5, "D20DT1"));
        students.add(new Student(2, "Nguyễn Xuân Vũ", 20, "Vĩnh phúc", 7.7, "D20TT1"));
        students.add(new Student(3, "Phạm Xuân Thu", 19, "Phú Thọ", 9.2, "D20DT1"));
        students.add(new Student(4, "Đỗ Ngọc Ánh", 21, "Hòa Bình", 6.8, "D20KT1"));
        students.add(new Student(5, "Vũ Anh Thư", 18, "Bắc Giang", 8.8, "D20KT1"));
        students.add(new Student(6, "Trần Mai Hương", 22, "Hà Nội", 8.2, "D20KT1"));
        students.add(new Student(7, "Nguyễn Trần Tùng", 21, "Hà Nội", 9.5, "D20MT3"));
        students.add(new Student(8, "Lê Quang Đức", 21, "Bắc Ninh", 7.2, "D20MT3"));
        students.add(new Student(9, "Lê Ngọc Diệp", 23, "Ninh Bình", 8, "D20MT3"));
        students.add(new Student(10, "Hứa Đức Hùng", 22, "Thanh Hóa", 6.2, "D20MT3"));
    }

    @Override
    public void showListStudent() {
        for (Student student : students) {
            System.out.println(student);
        }

    }

    @Override
    public Student addStudent() {
        int id = rd.nextInt(5, 100);
        System.out.println("Nhập vào thông tin sinh viên");
        System.out.print("Tên = ");
        String name = sc.nextLine();
        System.out.print("Tuổi = ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Địa chỉ = ");
        String address = sc.nextLine();
        System.out.print("Điểm = ");
        double point = Double.parseDouble(sc.nextLine());
        System.out.print("Lớp = ");
        String classroom = sc.nextLine();
        Student newStudent = new Student(id, name, age, address, point, classroom);
        students.add(newStudent);
        return newStudent;
    }

    @Override
    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student updatePointById(int newPoint, Student student) {
        student.setPoint(newPoint);
        return student;
    }

    @Override
    public void deleteStudentById(Student student) {
        students.remove(student);
    }

    @Override
    public void showStudentByClassroom(String classroom) {
        ArrayList<Student> listStudentByClass = new ArrayList<>();
        for (Student student : students) {
            if (student.getClassroom().contains(classroom)) {
                listStudentByClass.add(student);
            }
        }
        if (listStudentByClass.isEmpty()) {
            System.out.println("Lớp vừa nhập vào không có trong danh sách");
        } else {
            System.out.println("Dánh sách sinh viên của lớp " + classroom + " là");
            for (Student student : listStudentByClass) {
                System.out.println(student);
            }
        }

    }

    @Override
    public void sortByName() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void sortByAge() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void sortByPoint() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int tg = 0;
                if (o1.getPoint() > o2.getPoint()) {
                    tg = 1;
                } else if (o1.getPoint() < o2.getPoint()) {
                    tg = -1;
                } else {
                    tg = 0;
                }
                return tg;
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
