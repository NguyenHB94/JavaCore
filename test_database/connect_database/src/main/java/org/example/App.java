package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {

//        ConnectDatabase connectDatabase = new ConnectDatabase();
//        Connection conn = connectDatabase.getConnect();
//
//        String query = "SELECT * FROM `user`";
//        try {
//            //Tạo đối tượng statement (Tạo câu truy vấn)
//            Statement stm = conn.createStatement();
//
//            //Thực thi câu truy vấn và trả về kết quả
//            ResultSet rs = stm.executeQuery(query);
//
//            //Duyệt kết quả
//            while (rs.next()){
//                int id = rs.getInt("id");
//                String userName = rs.getString("user_name");
//                String email = rs.getString("email");
//                String password = rs.getString("password");
//                Date createAt = rs.getDate("create_at");
//
//                System.out.println(id + " - " + userName + " - " + email
//                        + " - " + password + " - " + createAt) ;
//
//            }
//
//            //Đóng kết nối
//            conn.close();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        UserService service = new UserService();

        ArrayList<User> list = service.getAllUser();
        service.show(list);

        User u = service.getUserById("017771");
        System.out.println(u);

        Date date = java.sql.Date.valueOf(LocalDate.now());
        User newUser = new User(Util.randomId(5), "hoa", "hoa@gmail.com", "123456", date);

        service.newUser(newUser);
    }
}
