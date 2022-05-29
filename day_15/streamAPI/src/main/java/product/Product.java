package product;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Product {
    private int id;
    private String name;
    private int price;
    private String brand;
    private int count;

    public void printInfo() {
        System.out.println(id + "-" + name + "-" + price + "-" + brand + "-" + count);
    }
}
