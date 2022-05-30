package product;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Iphone 13 Pro Max", 30_000_000, "Apple", 2));
        products.add(new Product(2, "Samsung Galaxy Z Fold3", 41_000_000, "Samsung", 3));
        products.add(new Product(3, "IPhone 11", 12_000_000, "Apple", 1));
        products.add(new Product(4, "OPPO Find X3 Pro", 19_500_000, "Oppo", 5));
        products.add(new Product(5, "Xiaomi 11T", 9_500_000, "Xiaomi", 7));
        products.add(new Product(6, "Vivo V21", 23_500_000, "Vivo", 6));

        ProductService productService = new ProductService();

        //In ra thông tin sản phẩm
        productService.print(products);
        System.out.println();

        //Tính tổng tiền
        int totalMoney = productService.getTotalMoneyProduct(products);
        System.out.println(totalMoney);
        System.out.println();

        //Tìm sản phẩm theo tên
        productService.getProductByBrand(products, "Apple").forEach(Product::printInfo);
        System.out.println();

        //Tìm sản phẩm theo giá
        productService.getProductByPrice(products, 20_000_000).forEach(Product::printInfo);
        System.out.println();

        //Tìm sản phẩm tên có chữ Pro
        productService.findByStringPro(products).forEach(Product::printInfo);
        System.out.println();

        //Thêm sản phẩm
        productService.addProduct(products);
        products.forEach(Product::printInfo);
        System.out.println();

        //Xoá sản phẩm brand Samsung
        productService.deleteByBrand(products, "Samsung");
        products.forEach(Product::printInfo);
        System.out.println();

        //Sắp xếp theo gia tăng dần
        productService.sortByPriceAscend(products);
        System.out.println();

        //Sắp xếp theo tồn kho giảm dần
        productService.sortByCount(products);
        System.out.println();
    }
}
