package controller;

import model.Player;
import service.PlayerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PlayersController {
    private final PlayerService playerService = new PlayerService();

    public void run() {
        boolean isContinues = true;
        int option = 0;

        while (isContinues) {
            Scanner sc = new Scanner(System.in);
            showMenu();
            System.out.println("Nhập vào lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());
            System.out.println();

            switch (option) {
                case 1 : {
                    System.out.println("Đội hình gồm có: ");
                    playerService.printTeam1();
                    break;
                }
                case 2 : {
                    System.out.println("Đội hình gồm có: ");
                    playerService.printTeam2();
                    break;
                }
                case 3 : {
                    System.out.println("Đội hình gồm có: ");
                    playerService.printTeam3();
                    break;
                }
                case 4 : {
                    System.out.println("Đội hình gồm có: ");
                    playerService.printTeam4();
                    break;
                }
                case 5 : {
                    isContinues = false;
                    break;
                }
                default: {
                    System.out.println("Lựa chọn không phù hợp");
                    break;
                }
            }

        }

    }
    public void showMenu() {
        System.out.println("**********Đội hình**********");
        System.out.println("1. Đội hình theo sơ đồ chiến thuật 4-4-2");
        System.out.println("2. Đội hình theo sơ đồ chiến thuật 4-3-3");
        System.out.println("3. Đội hình theo sơ đồ chiến thuật 3-5-2");
        System.out.println("4. Đội hình theo sơ đồ chiến thuật 4-5-1");
        System.out.println("5. Thoát lựa chọn\n");

    }
}
