package service;

import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    Scanner sc = new Scanner(System.in);
    //Khỏi tạo danh sách sản phẩm
    private ArrayList<Product> products;

    public ProductService() { init();
    }

    //Khỏi tạo data
    private void init() {
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

    //Return danh sách sản phẩm
    public ArrayList<Product> getProducts() {
        return products;
    }

    //In ra thông tin sản phẩm
    public void prinInfo(ArrayList<Product> listProducts) {

        for (Product product : listProducts) {
            System.out.println(product);
        }
    }

    //Tìm sản phẩm theo tên
    public ArrayList<Product> findByName(String name) {
        ArrayList<Product> findList = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name)) {
                findList.add(product);
            }
        }
        return findList;
    }

    //Tìm sản phẩm theo Id
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    //Xóa sản phẩm theo Id
//    public void deleteProductById(int id) {
//        Iterator<Product> iterator = products.iterator();
//        while (iterator.hasNext()) {
//            Product product = iterator.next();
//            if (product.getId() == id) {
//                iterator.remove();
//            }
//        }
//    }
    public void deleteProduct(Product product) {
        products.remove(product);
    }

    //Cập nhật số lượng sản phẩm theo id
    public Product updateQuantity(Product product) {
        System.out.println("Nhập số lượng mới của sản phẩm: ");
        int newQuantity = Integer.parseInt(sc.nextLine());
        product.setQuantity(newQuantity);
        return product;
    }

    //Tìm sản phẩm có số lượng < 5
    public ArrayList<Product> getProducSmallThan5() {
        ArrayList<Product> listSmallThan5 = new ArrayList<>();
        for (Product product : products) {
            if (product.getQuantity() < 5) {
                listSmallThan5.add(product);
            }
        }
        return listSmallThan5;
    }

    //Tìm sản phẩm theo mức giá
    public ArrayList<Product> findByPrice(int minPrice, int maxPrice) {
        ArrayList<Product> listAboutPrice = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() < maxPrice) {
                listAboutPrice.add(product);
            }
        }
        return listAboutPrice;
    }



}
