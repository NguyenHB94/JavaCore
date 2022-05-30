package model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class User {
    private int id;
    private String phone;
    private String password;
    private String account;
    private int balance;
}
