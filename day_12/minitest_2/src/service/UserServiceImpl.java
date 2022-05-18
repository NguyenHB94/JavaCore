package service;

import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserServiceImpl implements IUserService{

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
    public boolean login(String email, String password) {

        boolean isLogin;

        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)){
                return isLogin = true;
            }
        }

        return isLogin = false;

    }

    @Override
    public void changeUserName() {

    }

    @Override
    public void changeEmail() {

    }

    @Override
    public void changePassword() {

    }

    @Override
    public void recoverPassword() {

    }

    @Override
    public void createNewUser() {

    }

    @Override
    public boolean checkSyntaxUserName(String userName) {
        return false;
    }

    @Override
    public boolean checkSyntaxEmail(String email) {
        return false;
    }

    @Override
    public boolean checkSyntaxPassword(String password) {
        return false;
    }
}
