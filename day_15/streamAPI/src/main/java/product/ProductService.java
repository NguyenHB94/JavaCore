package product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    //1. In ra thông tin các sản phẩm trong giỏ hàng theo cấu trúc sau
    //ID - Tên - Giá - Thương Hiệu - Số lượng
    //Ví dụ : 1- OPPO Find X3 Pro - 19500000 - OPPO - 3
    public void print(List<Product> products) {
        products.stream().forEach(Product::printInfo);
    }

    //2. Tính tổng tiền tất cả sản phẩm trong giỏ hàng
    //   Tổng tiền mỗi sản phẩm = price * count
    public int getTotalMoneyProduct(List<Product> products) {
        return products.stream()
                .map(product -> product.getPrice() * product.getCount())
                .reduce(0, (p1, p2) -> p1 + p2);
    }

    //3. Tìm các sản phẩm của thuơng hiệu “Apple”
    public List<Product> getProductByBrand(List<Product> products, String branName) {
        return products
                .stream()
                .filter(p -> p.getBrand().equals(branName))
                .collect(Collectors.toList());
    }

    //4. Tìm các sản phẩm có giá > 20000000
    public List<Product> getProductByPrice(List<Product> products, int price) {
        return products
                .stream()
                .filter(p -> p.getPrice() > price)
                .collect(Collectors.toList());
    }

    //5. Tìm các sản phẩm có chữ “pro” trong tên (Không phân biệt hoa thường)
    public List<Product> findByStringPro(List<Product> products) {
        return products
                .stream()
                .filter(p -> p.getName().contains("Pro"))
                .collect(Collectors.toList());
    }

    //6. Thêm 1 sản phẩm bất kỳ vào trong mảng product
    public void addProduct(List<Product> products) {
        products.add(new Product(7, "Iphone 12 Pro", 26_000_000, "Apple", 6));
    }

    //7. Xóa tất cả sản phẩm của thương hiệu “Samsung” trong giỏ hàng
    public void deleteByBrand(List<Product> products, String brand) {
        products.removeIf(product -> product.getBrand().equals(brand));
    }

    //8. Sắp xếp giỏ hàng theo price tăng dần
    public void sortByPriceAscend(List<Product> products) {
        products.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(Product::printInfo);
    }

    //9. Sắp xếp giỏ hàng theo count giảm dần
    public void sortByCount(List<Product> products) {
       products.stream().sorted(Comparator.comparing(Product::getCount).reversed()).forEach(Product::printInfo);
    }

    //10. Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng
}
