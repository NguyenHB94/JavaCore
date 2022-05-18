package service;

import model.User;

import java.util.ArrayList;

public interface IUserService {

    public User login();
    public void changeUserName(User user);
    public void changeEmail(User user);
    public void changePassword(User user);
    public void recoverPasswordByEmail();
    public void createNewUser();
    public boolean checkUserNameOfList(String username, ArrayList<User> users);
    public boolean checkEmailOfList(String email, ArrayList<User> users);
    public boolean checkSyntaxUserName(String userName);
    public boolean checkSyntaxEmail(String email);
    public boolean checkSyntaxPassword(String password);

}
