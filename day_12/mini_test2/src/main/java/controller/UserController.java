package controller;

import model.User;
import service.CustomException;
import service.UserServiceImpl;

import java.util.Scanner;

public class UserController {
    public UserServiceImpl userService = new UserServiceImpl();
    Scanner sc = new Scanner(System.in);

    public UserController() {
    }

    public void run() {
        boolean isContinues = true;
        int option = 0;
        while (isContinues) {
            mainMenu();
            System.out.println("Nhập lựa chọn:");
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                //System.out.println("Lựa chọn không phù hợp");
                //break;
                option = 0;
            }

            switch (option) {
                case 1: {
                    User users = new User();
                    try {
                        users = userService.login();
                    } catch (CustomException e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                    System.out.println("Chào mừng " + users.getUsername() + ", bạn có thể thực hiện các công việc sau");
                    boolean isSubContinues = true;
                    int subOption = 0;
                    while (isSubContinues) {
                        subMenu();
                        System.out.println("Nhập lựa chọn:");
                        try {
                            subOption = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            //System.out.println("Lựa chọn không phù hợp");
                            //break;
                            subOption = 0;
                        }

                        switch (subOption) {
                            case 1: {
                                try {
                                    userService.changeUserName(users);
                                } catch (CustomException e) {
                                    System.out.println(e.getMessage());
                                    break;
                                }
                                break;
                            }
                            case 2: {
                                try {
                                    userService.changeEmail(users);
                                } catch (CustomException e) {
                                    System.out.println(e.getMessage());
                                    break;
                                }

                                break;
                            }
                            case 3: {
                                try {
                                    userService.changePassword(users);
                                } catch (CustomException e) {
                                    System.out.println(e.getMessage());
                                    break;
                                }
                                break;
                            }
                            case 4: {
                                isSubContinues = false;
                                break;
                            }
                            case 5: {
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

                    break;
                }
                case 2: {
                    try {
                        userService.createNewUser();
                    } catch (CustomException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Đăng ký không thành công");
                        break;
                    }

                    break;
                }
                case 3: {
                    try {
                        userService.forgetPassowrd();
                    } catch (CustomException e) {
                        System.out.println(e.getMessage());
                        break;
                    }

                    break;
                }
                case 4: {
                    isContinues = false;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
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
