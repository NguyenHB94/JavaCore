package service;

import model.Student;

import java.util.ArrayList;

public interface IStudentService {
    //    //Thực hiện:
    //    //
    //    //Xem danh sách học sinh
    //    //Thêm học sinh mới
    //    //Cập nhập điểm học sinh
    //    //Xóa học sinh
    //    //Xem danh sách học sinh theo lớp
    //    //Sắp xếp theo tên
    //    //Sắp xếp theo tuổi
    //    //Sắp xếp theo điểm
    void showListStudent();

    Student addStudent();

    Student findById(int id);

    Student updatePointById(int newPoint, Student student);

    void deleteStudentById(Student student);

    void showStudentByClassroom(String classroom);

    void sortByName();

    void sortByAge();

    void sortByPoint();

}
