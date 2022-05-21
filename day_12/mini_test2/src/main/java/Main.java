import controller.UserController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UserController userController = new UserController();
        userController.run();
    }
}
