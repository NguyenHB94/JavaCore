package controller;

import model.User;
import service.UserServiceImpl;

import java.util.Scanner;

public class UserController {
    public final UserServiceImpl userService = new UserServiceImpl();
    Scanner sc = new Scanner(System.in);
    public void run() {
        boolean isContinues = true;
        int option = 0;
        while (isContinues) {
            mainMenu();
            System.out.println("Nhập lựa chọn:");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1: {
                    User users = userService.login();
                    if (users == null) {
                        System.out.println("Email hoặc mật khẩu không đúng");
                    } else {
                        System.out.println("Chào mừng " + users.getUsername() + ", bạn có thể thực hiện các công việc sau");
                        boolean isSubContinues = true;
                        int subOption = 0;
                        while (isSubContinues) {
                            subMenu();
                            System.out.println("Nhập lựa chọn:");
                            subOption = Integer.parseInt(sc.nextLine());

                            switch (subOption) {
                                case 1 : {
                                    userService.changeUserName(users);
                                    break;
                                }
                                case 2 : {
                                    userService.changeEmail(users);
                                    break;
                                }
                                case 3 : {
                                    userService.changePassword(users);
                                }
                                case 4 : {
                                    isSubContinues = false;
                                    break;
                                }
                                case 5 : {
                                    isContinues = false;
                                    isSubContinues = false;
                                    break;
                                }
                                default: {
                                    System.out.println("Lựa chọn không hợp lệ");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                case 2 : {
                    userService.createNewUser();
                    break;
                }
                case 3 : {

                    userService.recoverPasswordByEmail();
                    break;
                }
                case 4 : {
                    isContinues = false;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                }

            }
        }
    }
    public void mainMenu() {
        System.out.println("********MENU********");
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        System.out.println("3. Quên mật khẩu");
        System.out.println("4. Thoát\n");
    }

    public void subMenu() {
        System.out.println("*****Action*****");
        System.out.println("1. Thay đổi username");
        System.out.println("2. Thay đổi email");
        System.out.println("3. Thay đổi mật khẩu");
        System.out.println("4. Đăng xuất");
        System.out.println("5. Thoát chương trình");
    }
}
