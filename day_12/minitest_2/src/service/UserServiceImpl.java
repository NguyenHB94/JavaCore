package service;

import model.User;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserServiceImpl implements IUserService {

    Scanner sc = new Scanner(System.in);
    private ArrayList<User> users;

    public UserServiceImpl() {
        init();
    }

    public void init() {
        users = new ArrayList<>();
        users.add(new User("namhb1", "namhb@gmail.com", "nam123456"));
        users.add(new User("congtb17", "congtb@gmail.com", "cong123456"));
        users.add(new User("trunghv1", "trunghv@gmail.com", "trung123456"));
        users.add(new User("sangnq", "sangnq@gmail.com", "sang123456"));
        users.add(new User("huybq", "huybq@gmail.com", "huy123456"));
    }

    @Override
    public User login(String email, String password) {

        boolean isLogin;

        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return user;
            }
        }

        return null;

    }

    @Override
    public void changeUserName(User user, String newUserName) {
        user.setUsername(newUserName);
        System.out.println("Bạn đã thay đổi thành công tên đăng nhập mới: " + newUserName);
    }

    @Override
    public void changeEmail(User user) {
        System.out.println("Nhập vào Email mới");
        String newEmail = sc.nextLine();

        if (checkSyntaxEmail(newEmail)) {
            for (User u : users) {
                if (u.getEmail().equals(newEmail)) {
                    System.out.println("Email đã tồn tại, vui lòng nhập Email khác");
                    break;
                } else {
                    user.setEmail(newEmail);
                    System.out.println("Chúc mừng bạn đã thay đổi thành công Email mới: " + newEmail);
                    break;
                }
            }
        } else {
            System.out.println("Email mới nhập vào không hợp lệ, vui lòng nhập Email khác");
        }

    }

    @Override
    public void changePassword(User user) {
        System.out.println("Nhập vào password mới");
        String newPassword = sc.nextLine();
        if (checkSyntaxPassword(newPassword)) {
            user.setPassword(newPassword);
            System.out.println("Bạn đã thay đổi password thành công");
        } else {
            System.out.println("Password không hợp lệ");
        }
    }

    @Override
    public void recoverPasswordByEmail() {
        System.out.println("Nhập vào email đăng nhập: ");
        String email = sc.nextLine();
        for (User u : users) {
            if (u.getEmail().equals(email)) {
                System.out.println("Nhập mật khẩu mới: ");
                String newPasswords = sc.nextLine();

                u.setPassword(newPasswords);
                System.out.println("Chúc mừng bạn thay đổi mật khẩu mới thành công");
            } else {
                System.out.println("Tài khoản không tồn tại");
            }
        }
    }

    @Override
    public void createNewUser() {
        System.out.println("Nhập vào thôn tin tài khoản cần tạo mới: ");
        System.out.print("Nhập vào tên đăng nhập: ");
        String userName = sc.nextLine();
        if (checkSyntaxUserName(userName)) {
            if (checkUserNameOfList(userName, users)) {
                System.out.print("Nhập vào Email: ");
                String email = sc.nextLine();
                if (checkSyntaxEmail(email)) {
                    if (checkEmailOfList(email, users)) {
                        System.out.print("Password = ");
                        String password = sc.nextLine();
                        if (checkSyntaxPassword(password)) {
                            User newUser = new User(userName, email, password);
                            users.add(newUser);
                            System.out.println("Tạo tài khoản mới thành công");
                        } else {
                            System.out.println("Password không hợp lệ");
                        }
                    } else {
                        System.out.println("Email đã tồn tại");
                    }
                } else {
                    System.out.println("Email Không hợp lệ");
                }
            } else {
                System.out.println("Username đã tồn tại");
            }
        } else {
            System.out.println("Username không hợp lệ");
        }

    }

    @Override
    public boolean checkUserNameOfList(String username, ArrayList<User> users) {
        for (User u : users) {
            if (u.getPassword().equals(username)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkEmailOfList(String email, ArrayList<User> users) {
        for (User u : users) {
            if (u.getPassword().equals(email)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkSyntaxUserName(String userName) {
        String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";
        boolean resultusr = Pattern.matches(USERNAME_PATTERN, userName);
        return resultusr;
    }

    @Override
    public boolean checkSyntaxEmail(String email) {
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";

        boolean resulte = Pattern.matches(EMAIL_PATTERN, email);
        return resulte;
    }

    @Override
    public boolean checkSyntaxPassword(String password) {
        boolean resultpw;
        if (password.length() > 7 && password.length() < 15) {
            resultpw = true;
        } else {
            resultpw = false;
        }
        return resultpw;
    }
}
