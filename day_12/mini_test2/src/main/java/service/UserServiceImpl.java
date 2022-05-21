package service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.User;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;

public class UserServiceImpl implements IUserService {

    Scanner sc = new Scanner(System.in);


    List<User> listUser = new ArrayList<>();
    Optional<List<User>> optionalListUsers;

    public UserServiceImpl() {
        listUser = getListObjectFromJsonFile("list-acount.json");
        //List<User> users = new ArrayList<>(listUser);
        optionalListUsers = Optional.ofNullable(listUser);
    }


    public List<User> getListObjectFromJsonFile(String fileName) {
        try {
            // Khởi tạo đối tượng gson
            Gson gson = new Gson();

            // Tạo đối tượng reader để đọc file
            //Reader reader = Files.newBufferedReader(Paths.get(fileName));

            FileReader reader = new FileReader(fileName);

            // Đọc thông tin từ file và binding và class

            List<User> users = Arrays.asList(gson.fromJson(reader, User[].class));

            // Đọc file xong thì đóng lại
            // Và trả về kết quả
            reader.close();
            return users;
        } catch (NullPointerException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    private void convertObjectToJsonFile(String fileName, Object obj) {
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            //Writer writer = Files.newBufferedWriter(Paths.get(fileName));
            Writer writer = new FileWriter(fileName);

            gson.toJson(obj, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public User login() {
        listUser = getListObjectFromJsonFile("list-acount.json");
        System.out.println("Nhập Email đăng nhập: ");
        String email = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();
        if (optionalListUsers.isEmpty()) {
            throw new CustomException("Email hoặc mật khẩu không tồn tại");
        }
        User user = new User();
        int haveUser = 0;
        for (User userLogin : listUser) {
            if (userLogin.getEmail().equals(email) && userLogin.getPassword().equals(password)) {
                user = userLogin;
                haveUser++;
            }
        }
        if (haveUser == 0) {
            throw new CustomException("Email hoặc mật khẩu không đúng");
        }
        return user;
    }

    @Override
    public void changeUserName(User user) {
        System.out.println("Nhập username mới: ");
        String newUserName = sc.nextLine();
        if (checkSyntaxUserName(newUserName)) {
            throw new CustomException("Tên đăng nhập không đúng định dạng");
        }
        if (checkUserNameOfList(newUserName)) {
            throw new CustomException("Tên đăng nhập đã tồn tại");
        }
        user.setUsername(newUserName);
        convertObjectToJsonFile("list-acount.json", listUser);
        System.out.println("Bạn đã thay đổi thành công tên đăng nhập mới: " + newUserName);
    }

    @Override
    public void changeEmail(User user) {
        System.out.println("Nhập vào Email mới");
        String newEmail = sc.nextLine();

        if (!checkSyntaxEmail(newEmail)) {
            throw new CustomException("Email không đúng định dạng");
        }

        if (checkEmailOfList(newEmail)) {
            throw new CustomException("Email đã tồn tại");
        }

        user.setEmail(newEmail);
        convertObjectToJsonFile("list-acount.json", listUser);
        System.out.println("Chúc mừng bạn đã thay đổi thành công Email mới: " + newEmail);

    }

    @Override
    public void changePassword(User user) {
        System.out.println("Nhập vào password mới");
        String newPassword = sc.nextLine();
        if (!checkSyntaxPassword(newPassword)) {
           throw new CustomException("Password không đúng định dạng");
        }
        user.setPassword(newPassword);
        convertObjectToJsonFile("list-acount.json", listUser);
        System.out.println("Bạn đã thay đổi password thành công");
    }

    @Override
    public void forgetPassowrd() {
        System.out.println("Nhập vào email đăng nhập: ");
        String email = sc.nextLine();
        int haveEmail = 0;
        for (User u : listUser) {
            if (u.getEmail().equals(email)) {
                haveEmail ++;
                System.out.println("Nhập mật khẩu mới: ");
                String newPasswords = sc.nextLine();

                if (!checkSyntaxPassword(newPasswords)) {
                    throw new CustomException("Password không hợp lệ");
                }

                u.setPassword(newPasswords);
                convertObjectToJsonFile("list-acount.json", listUser);
                System.out.println("Chúc mừng bạn thay đổi mật khẩu mới thành công");
            }

        }
        if (haveEmail == 0) {
            throw new CustomException("Email không tồn tại");
        }
    }

    @Override
    public void createNewUser() {
        System.out.println("Nhập vào thôn tin tài khoản cần tạo mới: ");
        System.out.print("Nhập vào tên đăng nhập: ");
        String userName = sc.nextLine();
        if (checkUserNameOfList(userName)) {
            throw new CustomException("Tên đăng nhập đã tồn tại");
        }
        if (!checkSyntaxUserName(userName)) {
            throw new CustomException("Tên đăng nhập không đúng định dạng");
        }

        System.out.print("Nhập vào email: ");
        String email = sc.nextLine();
        if (checkEmailOfList(email)) {
            throw new CustomException("Email đã tồn tại");
        }
        if (!checkSyntaxEmail(email)) {
            throw new CustomException("Email không đúng định dạng");
        }

        System.out.print("Nhập vào mật khẩu: ");
        String password = sc.nextLine();
        if (!checkSyntaxPassword(password)) {
            throw new CustomException("Mật khẩu không đúng định dạng");
        }

        User newUser = new User(userName, email, password);
        List<User> newUsers = new ArrayList<>();
        if (optionalListUsers.isEmpty()) {
            newUsers.add(newUser);
            convertObjectToJsonFile("list-acount.json", newUsers);
        } else {
//            newUsers.add(newUser);
//            newUsers.addAll(listUser);
            List<User> users = new ArrayList<>(listUser);
            users.add(newUser);
            convertObjectToJsonFile("list-acount.json", users);
        }
        System.out.println("Đăng ký thành công");
    }

    @Override
    public boolean checkUserNameOfList(String username) {
        if (optionalListUsers.isPresent()) {
            for (User u : listUser) {
                if (u.getUsername().equals(username)) {
                    return true;
                }
            }
            return false;
        }

        return false;
    }

    @Override
    public boolean checkEmailOfList(String email) {
        if (optionalListUsers.isPresent()) {
            for (User u : listUser) {
                if (u.getEmail().equals(email)) {
                    return true;
                }
            }
            return false;
        }

        return false;
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


