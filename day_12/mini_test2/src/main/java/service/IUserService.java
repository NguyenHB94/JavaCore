package service;

import model.User;

import java.io.IOException;

public interface IUserService {

    public User login();
    public void changeUserName(User user);
    public void changeEmail(User user);
    public void changePassword(User user);
    public void forgetPassowrd();
    public void createNewUser() throws IOException;
    public boolean checkUserNameOfList(String username);
    public boolean checkEmailOfList(String email);
    public boolean checkSyntaxUserName(String userName);
    public boolean checkSyntaxEmail(String email);
    public boolean checkSyntaxPassword(String password);

}
