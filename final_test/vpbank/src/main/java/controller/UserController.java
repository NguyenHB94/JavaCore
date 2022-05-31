package controller;

import exception.MyException;
import model.User;
import service.UserService;

import java.util.Scanner;

public class UserController {
    Scanner sc = new Scanner(System.in);
    public UserService userService = new UserService();

    public void run() {
        boolean isContinues = true;
        User userLogin = new User();
        try {
            userLogin = userService.Login();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            isContinues = false;
        }

        int option = 0;

        while (isContinues) {
            showMenu();
            System.out.println("Nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 : {
                    try {
                        userService.showBalance(userLogin);
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                }
                case 2 : {
                    try {
                        userService.transferMoney(userLogin);
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Số tiền nhập vào không đúng định dạng");
                    }

                    break;
                }
                case 3 : {
                    try {
                        userService.showTransactionHistories(userLogin);
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                }
                case 4 : {
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

    public void showMenu() {
        System.out.println("*****MENU*****");
        System.out.println("1. Truy vấn số dư tài khoản");
        System.out.println("2. Chuyển tiền");
        System.out.println("3. Xem lịch sử giao dịch");
        System.out.println("4. Đăng xuất");
    }
}
