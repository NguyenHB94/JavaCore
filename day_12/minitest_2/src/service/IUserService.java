package service;

public interface IUserService {

    public boolean login(String email, String password);
    public void changeUserName();
    public void changeEmail();
    public void changePassword();
    public void recoverPassword();
    public void createNewUser();
    public boolean checkSyntaxUserName(String userName);
    public boolean checkSyntaxEmail(String email);
    public boolean checkSyntaxPassword(String password);

}
