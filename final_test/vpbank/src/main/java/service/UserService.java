package service;

import exception.MyException;
import model.TransactionHistory;
import model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserService {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    private List<User> users = new ArrayList<>();
    private List<TransactionHistory> transactionHistories = new ArrayList<>();

    public UserService() {
        init();
    }

    public void init() {
        users.add(new User(1, "0988123456", "account1", "281411111", 20_000_000));
        users.add(new User(2, "0986123321", "account2", "281422222", 10_000_000));
        users.add(new User(3, "0901666888", "account3", "281433333", 5_000_000));
        users.add(new User(4, "0975555888", "account4", "281444444", 1_000_000));
        users.add(new User(5, "0914999999", "account5", "281455555", 15_000_000));
        users.add(new User(6, "0915555555", "account6", "281466666", 50_000_000));
        users.add(new User(7, "0869999999", "account7", "281477777", 100_000_000));
        users.add(new User(8, "0706050403", "account8", "281488888", 500_000));
        users.add(new User(9, "0335333333", "account9", "281499999", 200_000));
        users.add(new User(10, "0988888888", "account10", "281400000", 200_000_000));
    }

    //Login
    public User Login() {
        System.out.println("Nhập vào số điện thoại đăng nhập: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();

        User user = new User();
        user = users.stream()
                .filter(u -> u.getPhone().equals(phoneNumber) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);

        if (user == null) {
            throw new MyException("Số điện thoại hoặc mật khẩu không đúng");
        }

        System.out.println("Đăng nhập thành công");
        return user;

    }

    public void showBalance(User user) {
        System.out.println("Số dư trong tài khoản của bạn là: " + user.getBalance());
    }

    public void transferMoney(User user) {
        System.out.println("Nhập số tài khoản người nhận: ");
        String receiveAccount = sc.nextLine();

        User receiveUser = users.stream()
                .filter(a -> a.getAccount().equals(receiveAccount))
                .findFirst()
                .orElse(null);
        //Check số tài khoản
        if (receiveUser == null) {
            throw new MyException("Số tài khoản không đúng");
        }

        System.out.println("Nhập số tiền muốn chuyển: ");
        int sentMoney = Integer.parseInt(sc.nextLine());
        //Check số tiền chuyển
        if (sentMoney < 50_000) {
            throw new MyException("Số tiền cần chuyển tối thiểu là 50_000");
        }
        if ((user.getBalance() - sentMoney) < 50_000) {
            throw new MyException("Số dư tài khoản không đủ để thực hiện giao dịch");
        }

        System.out.println("Nhập tin nhắn: ");
        String content = sc.nextLine();

        LocalDateTime dateTime = LocalDateTime.now();
        int id = transactionHistories.toArray().length;
        int moneyOfSentAccout = user.getBalance() - sentMoney;
        int moneyOfReceiveAccount = receiveUser.getBalance() + sentMoney;

        user.setBalance(moneyOfSentAccout);
        receiveUser.setBalance(moneyOfReceiveAccount);

        System.out.println("Bạn đã chuyển thành công số tiền " + sentMoney + " đến số tài khoản " + receiveAccount);
        transactionHistories.add(new TransactionHistory(id, user.getAccount(), content, dateTime, receiveAccount, sentMoney));
    }

    public void showTransactionHistories(User user) {
        if (transactionHistories.isEmpty()) {
            throw new MyException("Bạn chưa thực hiện giao dịch nào");
        }
        List<TransactionHistory> history = transactionHistories.stream()
                .filter(s -> s.getSentAccount().equals(user.getAccount()))
                .collect(Collectors.toList());
        if (history.isEmpty()) {
            throw new MyException("Bạn chưa thực hiện giao dịch nào");
        }

        history.forEach(s -> s.printHistory());

    }

}
