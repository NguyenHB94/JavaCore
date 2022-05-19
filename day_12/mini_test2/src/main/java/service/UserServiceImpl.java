package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.User;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserServiceImpl implements IUserService {

    Scanner sc = new Scanner(System.in);

    private List<User> listUser;

    public UserServiceImpl() {
    }

    public List<User> readObjectFromJsonFile(String fileName) {

        List<User> users = null;
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            Reader reader = Files.newBufferedReader(Paths.get(fileName));

            users = Arrays.asList(gson.fromJson(reader, User[].class));

            reader.close();

//            return users;

        } catch (NullPointerException e) {
            System.out.println("Dữ liệu account trống");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    private void writerObjectToJsonFile(String fileName, Object obj) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            Writer writer = Files.newBufferedWriter(Paths.get(fileName));

            gson.toJson(obj, writer);

            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public User login() {
        listUser = readObjectFromJsonFile("list-acount.json");
        System.out.println("Nhập Email đăng nhập: ");
        String email = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();
        try {
            for (User userLogin : listUser) {
                if (userLogin.getEmail().equals(email) && userLogin.getPassword().equals(password)) {
                    return userLogin;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Email or Password is not found");
        }

        return null;
    }

    @Override
    public void changeUserName(User user) {
        System.out.println("Nhập username mới: ");
        String newUserName = sc.nextLine();
        user.setUsername(newUserName);
        writerObjectToJsonFile("list-acount.json", listUser);
        System.out.println("Bạn đã thay đổi thành công tên đăng nhập mới: " + newUserName);
    }

    @Override
    public void changeEmail(User user) {
        System.out.println("Nhập vào Email mới");
        String newEmail = sc.nextLine();

        if (checkSyntaxEmail(newEmail)) {
            for (User u : listUser) {
                if (u.getEmail().equals(newEmail)) {
                    System.out.println("Email đã tồn tại, vui lòng nhập Email khác");
                    break;
                } else {
                    user.setEmail(newEmail);
                    writerObjectToJsonFile("list-acount.json", listUser);
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
            writerObjectToJsonFile("list-acount", listUser);
            System.out.println("Bạn đã thay đổi password thành công");
        } else {
            System.out.println("Password không hợp lệ");
        }
    }

    @Override
    public void recoverPasswordByEmail() {
        System.out.println("Nhập vào email đăng nhập: ");
        String email = sc.nextLine();
        for (User u : listUser) {
            if (u.getEmail().equals(email)) {
                System.out.println("Nhập mật khẩu mới: ");
                String newPasswords = sc.nextLine();

                u.setPassword(newPasswords);
                writerObjectToJsonFile("list-acount", listUser);
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
            if (checkUserNameOfList(userName, listUser)) {
                System.out.print("Nhập vào Email: ");
                String email = sc.nextLine();
                if (checkSyntaxEmail(email)) {
                    if (checkEmailOfList(email, listUser)) {
                        System.out.print("Password = ");
                        String password = sc.nextLine();
                        if (checkSyntaxPassword(password)) {
                            User newUser = new User(userName, email, password);
                            //listUser = readObjectFromJsonFile("list-acount.json");
                            if (listUser == null) {
                                writerObjectToJsonFile("list-acount.json", newUser);
                            } else {
                                listUser.add(newUser);
                                writerObjectToJsonFile("list-acount.json", listUser);
                            }
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
    public boolean checkUserNameOfList(String username, List<User> users) {
        try {
            for (User u : users) {
                if (u.getPassword().equals(username)) {
                    return false;
                }
            }
        } catch (NullPointerException e) {

        }
        return true;
    }

    @Override
    public boolean checkEmailOfList(String email, List<User> users) {
        try {
            for (User u : users) {
                if (u.getPassword().equals(email)) {
                    return false;
                }
            }
        } catch (NullPointerException e) {

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


