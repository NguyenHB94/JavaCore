package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public interface IUserService {

    public User login();
    public void changeUserName(User user);
    public void changeEmail(User user);
    public void changePassword(User user);
    public void recoverPasswordByEmail();
    public void createNewUser();
    public boolean checkUserNameOfList(String username, List<User> users);
    public boolean checkEmailOfList(String email,List<User> users);
    public boolean checkSyntaxUserName(String userName);
    public boolean checkSyntaxEmail(String email);
    public boolean checkSyntaxPassword(String password);

}
