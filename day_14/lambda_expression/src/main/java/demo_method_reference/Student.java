package demo_method_reference;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Student {
    private int id;
    private String name;
    private String email;

    public void printInfo() {
        System.out.println("id = " + id + "name = " + name + "email = " + email);
    }
}
