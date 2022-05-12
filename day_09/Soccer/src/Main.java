import controller.PlayersController;
import model.Player;
import model.Position;
import service.PlayerService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       PlayersController playersController = new PlayersController();
       playersController.run();

    }
}
