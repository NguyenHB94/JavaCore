package service;

import model.Product;

import java.util.ArrayList;
import java.util.PropertyResourceBundle;
import java.util.Scanner;

public class ProductService {
    //Khỏi tạo danh sách sản phẩm
    private ArrayList<Product> products;
    Scanner sc = new Scanner(System.in);

    public ProductService() {
        init();
    }

    public void init() {
        products = new ArrayList<>();
        products.add(new Product(1, "Hoa quả sấy", "Hoa quả sấy kho túi 250g", 50, 55_000));
        products.add(new Product(2, "Snack Poca bò lúc lắc", "Snack vị bò lúc lắc gói 75g", 120, 5_000));
        products.add(new Product(3, "Bánh Qui Marie", "Bánh quy Marie gói 240g-Cosy", 4, 70_000));
        products.add(new Product(4, "Bánh trứng Tipo", "Bánh trứng Tipo gói 150g", 20, 35_000));
        products.add(new Product(5, "Bánh trứng Tipo", "Thùng 10 gói 150g", 20, 350_000));
        products.add(new Product(6, "Bánh gạo Ichi", "Bánh gạo Ichi gói 350g", 23, 27_000));
        products.add(new Product(7, "Bánh quy kem CreamO", "Bánh quy kem CreamO loại nhỏ", 13, 11_000));
        products.add(new Product(8, "Bánh Custas", "Bánh bông lan nhân kem trứng hộp 24 pack", 35, 134_000));
    }

    //return players
    public ArrayList<Product> getProductsList() {
        return products;
    }

    //in danh sách sản phẩm
    public void printInfo(ArrayList<Product> productsList) {
        for (Product product : productsList) {
            System.out.println(product);
        }
    }

    //Tìm kiếm sản phẩm theo tên
    public ArrayList<Product> findByName(String name) {
        ArrayList<Product> findList = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name)) {
                findList.add(product);
            }
        }
        return findList;
    }

    //Tìm kiếm sản phẩm theo Id
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    //Xoá sản phẩm theo Id
    public void deleteProduct(Product product) {
        products.remove(product);
    }

    //Cập nhật số lượng sản phẩm theo Id
    public Product updateQuantity(Product product, int newQuantity) {
        product.setNumber(newQuantity);
        return product;
    }

    //Tìm sản phẩm có số lượng dưới 5
    public ArrayList<Product> findByNumber() {
        ArrayList<Product> numberSmallThan5List = new ArrayList<>();
        for (Product product : products) {
            if (product.getNumber() < 5) {
                numberSmallThan5List.add(product);
            }
        }
        return numberSmallThan5List;
    }
    //Tìm sản phẩm theo khoảng giá
    public ArrayList<Product> findByPrice(int minPrice, int maxPrice) {
        ArrayList<Product> productsByPriceList = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() < maxPrice) {
                productsByPriceList.add(product);
            }
        }
        return productsByPriceList;
    }


}
