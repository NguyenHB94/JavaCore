package model;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class TransactionHistory {
    private int id;
    private String sentAccount;
    private String content;
    private LocalDateTime date;
    private String receiveAccount;
    private int money;
}
