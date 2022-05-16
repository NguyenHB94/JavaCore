package controller;

import model.Student;
import service.StudentServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    public final StudentServiceImpl studentService = new StudentServiceImpl();

    Scanner sc = new Scanner(System.in);

    public void run() {
        boolean isContinues = true;
        int option = 0;

        while (isContinues) {
            mainMenu();
            System.out.println("Mới nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    System.out.println("Danh sách sinh viên gồm có: ");
                    studentService.showListStudent();
                    System.out.println();
                    break;
                }

                case 2: {
                    Student newStudent = studentService.addStudent();
                    System.out.println("Thông tin sinh viên vừa được thêm mới là : ");
                    System.out.println(newStudent);
                    break;
                }

                case 3: {
                    System.out.println("Mời nhập vào ID của sinh viên cần tìm kiếm: ");
                    int id = Integer.parseInt(sc.nextLine());
                    Student studentFindById = studentService.findById(id);

                    if (studentFindById == null) {
                        System.out.println("ID vừa nhập vào không có trong danh sách");
                    } else {
                        System.out.println("Thông tin sinh viên có ID = " + id + " là: ");
                        System.out.println(studentFindById);

                        boolean isContinuesID = true;
                        int optionId = 0;

                        while (isContinuesID) {
                            subMenu();
                            System.out.println("Mời nhập lựa chọn: ");
                            optionId = Integer.parseInt(sc.nextLine());

                            switch (optionId) {
                                case 1: {
                                    studentService.deleteStudentById(studentFindById);
                                    System.out.println("Bạn vừa xóa thành công sinh viên có ID =" + id);
                                    System.out.println();
                                    isContinuesID = false;
                                    break;
                                }

                                case 2: {
                                    System.out.println("Nhập vào điểm số mới của sinh viên: ");
                                    int newPoint = Integer.parseInt(sc.nextLine());
                                    Student studentUpdate = studentService.updatePointById(newPoint, studentFindById);
                                    System.out.println("Thông tin sinh viên sau khi cập nhật điểm: ");
                                    System.out.println(studentUpdate);
                                    System.out.println();
                                    isContinuesID = false;
                                    break;
                                }

                                case 3: {
                                    isContinuesID = false;
                                    break;
                                }

                                default: {
                                    System.out.println("Lựa chọn không phù hợp");
                                    System.out.println();
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.println("Nhập vào lớp muốn hiển thị danh sách: ");
                    String classroom = sc.nextLine();
                    studentService.showStudentByClassroom(classroom);
                    System.out.println();
                    break;
                }

                case 5: {
                    System.out.println("Danh sách được sắp xếp theo tên bao gồm: ");
                    studentService.sortByName();
                    break;
                }

                case 6: {

                    System.out.println("Danh sách được sắp xếp theo tuổi bao gồm: ");
                    studentService.sortByAge();
                    break;
                }

                case 7: {

                    System.out.println("Danh sách được sắp xếp theo điểm bao gồm: ");
                    studentService.sortByPoint();
                    break;
                }

                case 8: {
                    isContinues = false;
                    break;
                }

                default: {
                    System.out.println("Lựa chọn không phù hợp");
                    break;
                }
            }
        }
    }

    private void mainMenu() {
        System.out.println("**********MENU**********");
        System.out.println("1. Xem danh sách sinh viên");
        System.out.println("2. Thêm sinh viên mới");
        System.out.println("3. Tìm học sinh theo ID");
        System.out.println("4. Xem danh sách sinh viên theo lớp");
        System.out.println("5. Sắp xếp danh sách theo tên");
        System.out.println("6. Sắp xếp danh sách theo tuổi");
        System.out.println("7. Sắp xếp danh sách theo điểm");
        System.out.println("8. Thoát\n");
    }

    private void subMenu() {
        System.out.println("***Tìm kiếm theo ID***");
        System.out.println("1. Xóa thông tin sinh viên");
        System.out.println("2. Cập nhật điểm cho sinh viên");
        System.out.println("3. Thoát\n");
    }
}
