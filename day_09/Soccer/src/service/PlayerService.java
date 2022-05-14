package service;

import model.Player;
import model.Position;

import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.Random;

public class PlayerService {

    private ArrayList<Player> players = new ArrayList<>();

    public PlayerService() {init();
    }

    //Khỏi tạo danh sách cầu thủ
    private void init() {

        // Các cầu thủ thuộc vị trí thủ môn
        players.add(new Player(1, "Bùi Tấn Trường", Position.GK));
        players.add(new Player(2, "Đặng Văn Lâm", Position.GK));
        players.add(new Player(3, "Nguyễn Văn Hoàng", Position.GK));
        players.add(new Player(4, "Quan Văn Chuẩn", Position.GK));

        // Các cầu thủ thuộc vị trí hậu vệ
        players.add(new Player(5, "Đỗ Duy Mạnh", Position.DF));
        players.add(new Player(6, "Nguyễn Thành Chung", Position.DF));
        players.add(new Player(7, "Trần Đình Trọng", Position.DF));
        players.add(new Player(8, "Nguyễn Phong Hồng Duy", Position.DF));
        players.add(new Player(9, "Vũ Văn Thanh", Position.DF));
        players.add(new Player(10, "Bùi Tiến Dũng", Position.DF));
        players.add(new Player(11, "Quế Ngọc Hải", Position.DF));
        players.add(new Player(12, "Hồ Tấn Tài", Position.DF));
        players.add(new Player(13, "Phạm Xuân Mạnh", Position.DF));
        players.add(new Player(14, "Đỗ Thanh Thịnh", Position.DF));

        // Các cầu thủ thuộc vị trí tiền vệ
        players.add(new Player(15, "Nguyễn Quang Hải", Position.MF));
        players.add(new Player(16, "Phạm Đức Huy", Position.MF));
        players.add(new Player(17, "Lương Xuân Trường", Position.MF));
        players.add(new Player(18, "Nguyễn Tuấn Anh", Position.MF));
        players.add(new Player(19, "Trần Minh Vương", Position.MF));
        players.add(new Player(20, "Phan Văn Đức", Position.MF));
        players.add(new Player(21, "Nguyễn Hoàng Đức", Position.MF));
        players.add(new Player(22, "Lý Công Hoàng Anh", Position.MF));

        // Các cầu thủ thuộc vị trí tiền đạo
        players.add(new Player(23, "Phạm Tuấn Hải", Position.FW));
        players.add(new Player(24, "Nguyễn Văn Toàn", Position.FW));
        players.add(new Player(25, "Nguyễn Công Phượng", Position.FW));
        players.add(new Player(26, "Hà Đức Chinh", Position.FW));
        players.add(new Player(27, "Nguyễn Tiến Linh", Position.FW));
    }

    public void printInfo(ArrayList<Player> list) {
        for (Player player : list) {
            System.out.println(player);
        }
    }

    private ArrayList<Player> getPlayers(Position position, int number) {
        Random rd = new Random();
        //creat listposition
        ArrayList<Player> listPosition = new ArrayList<>();
        for (Player player : players) {
            if (player.getPosition().equals(position)) {
                listPosition.add(player);
            }
        }
        //creat listrandom of listposition
        ArrayList<Player> listPlayersRandom = new ArrayList<>();
        for (int i = 0; i < number; i ++) {
            int randomIndex = rd.nextInt(listPosition.size());
            Player randomPlayer = listPosition.get(randomIndex);
            listPlayersRandom.add(randomPlayer);
            listPosition.remove(randomIndex);
        }
        return listPlayersRandom;
    }

    public ArrayList<Player> buildTeam(int GKNumber, int DFNumber, int MFNumber, int FWNumber) {
        //create listGK
        ArrayList<Player> listPlayersGK = new ArrayList<>();
        listPlayersGK  = getPlayers(Position.GK, GKNumber);
        //create listDF
        ArrayList<Player> listplayersDF = new ArrayList<>();
        listplayersDF = getPlayers(Position.DF, DFNumber);
        //create listMF
        ArrayList<Player> listplayersMF = new ArrayList<>();
        listplayersMF = getPlayers(Position.MF, MFNumber);
        //create listFW
        ArrayList<Player> listplayersFW = new ArrayList<>();
        listplayersFW = getPlayers(Position.FW, FWNumber);

        //create Teamlist
        ArrayList<Player> listTeam = new ArrayList<>();
        listTeam.addAll(listPlayersGK);
        listTeam.addAll(listplayersDF);
        listTeam.addAll(listplayersMF);
        listTeam.addAll(listplayersFW);

        return listTeam;

    }

    public void printTeam1(){
        ArrayList<Player> team1 = buildTeam(1, 4, 4, 2);
        printInfo(team1);
        System.out.println();
    }
    public void printTeam2() {
        ArrayList<Player> team2 = buildTeam(1, 4, 3 ,3);
        printInfo(team2);
        System.out.println();
    }
    public void printTeam3() {
        ArrayList<Player> team3 = buildTeam(1, 3, 5, 2);
        printInfo(team3);
        System.out.println();
    }
    public void printTeam4() {
        ArrayList<Player> team4 = buildTeam(1, 4, 5, 1);
        printInfo(team4);
        System.out.println();
    }

}
