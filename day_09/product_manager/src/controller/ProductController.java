package controller;

import model.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductController {
    private final ProductService productService = new ProductService();

    public void run() {
        boolean isContinues = true;
        int option = 0;

        while (isContinues) {
            Scanner sc = new Scanner(System.in);
            mainMenu();
            System.out.println("Mời nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (option) {
                case 1: {
                    System.out.println("Danh sách sản phẩm gồm có: ");
                    ArrayList<Product> listProduct = productService.getProductsList();
                    productService.printInfo(listProduct);
                    System.out.println();
                    break;
                }

                case 2: {
                    System.out.println("Nhập tên sản phẩm cần tìm kiếm: ");
                    String nameProduct = sc.nextLine();
                    System.out.println();
                    ArrayList<Product> products = productService.findByName(nameProduct);
                    if (products.isEmpty()) {
                        System.out.println("Sản phẩm cần tìm không có trong danh sách.");
                        System.out.println();
                    } else {
                        System.out.println("Thông tin sản phẩm bạn tìm kiếm: ");
                        productService.printInfo(products);
                        System.out.println();
                    }
                    break;
                }

                case 3: {
                    System.out.println("Nhập Id sản phẩm cần tìm kiếm: ");
                    int id = Integer.parseInt(sc.nextLine());
                    Product product = productService.findById(id);
                    if (product == null) {
                        System.out.println("Id nhập vào không hợp lệ");
                        System.out.println();
                    } else {
                        System.out.println("Thông tin sản phẩm có Id = " + id + " là: ");
                        System.out.println(product);
                        int subOptionId = 0;
                        subMenuId();
                        System.out.println("Nhập lựa chọn: ");
                        subOptionId = Integer.parseInt(sc.nextLine());

                        switch (subOptionId) {
                            case 1: {
                                productService.deleteProduct(product);
                                System.out.println("Bạn vừa xóa thành công sản phẩm có Id =" + id);
                                System.out.println();
                                break;
                            }

                            case 2: {
                                System.out.println("Nhập vào số lượng mới của sản phẩm: ");
                                int newQuantity = Integer.parseInt(sc.nextLine());
                                Product newProduct = productService.updateQuantity(product, newQuantity);
                                System.out.println("Thông tin sản phẩm vừa cập nhật số lượng: ");
                                System.out.println(newProduct);
                                System.out.println();
                                break;
                            }

                            case 3: {
                                break;
                            }

                            default: {
                                System.out.println("Lựa chọn không phù hợp");
                                break;
                            }
                        }
                    }
                }

                case 4: {
                    ArrayList<Product> listSmallThan5 = productService.findByNumber();
                    if (listSmallThan5.isEmpty()) {
                        System.out.println("Không có sản phẩm có số lượng dưới 5");
                    } else {
                        System.out.println("Thông tin sản phẩm có số lượng dưới 5 bao gồm: ");
                        productService.printInfo(listSmallThan5);
                        System.out.println();
                    }
                    break;
                }

                case 5: {
                    boolean isContinuePrice = true;
                    int optionPrice = 0;

                    while (isContinuePrice) {
                        subMenuPrice();
                        System.out.println("Nhập lựa chọn: ");
                        optionPrice = Integer.parseInt(sc.nextLine());
                        switch (optionPrice) {
                            case 1: {
                                ArrayList<Product> listPrice1 = productService.findByPrice(0, 50_000);
                                if (listPrice1.isEmpty()) {
                                    System.out.println("Không có sản phẩm nào có mức giá dưới 50000");
                                } else {
                                    System.out.println("Sản phẩm có mức giá dưới 50000 bao gồm: ");
                                    productService.printInfo(listPrice1);
                                    System.out.println();
                                }
                                break;
                            }

                            case 2: {
                                ArrayList<Product> listPrice2 = productService.findByPrice(50_000, 100_000);
                                if (listPrice2.isEmpty()) {
                                    System.out.println("Không có sản phẩm nào có mức giá từ 50000 đến dưới 100000");
                                } else {
                                    System.out.println("Sản phẩm có mức giá từ 50000 đến dưới 100000 bao gồm: ");
                                    productService.printInfo(listPrice2);
                                    System.out.println();
                                }
                                break;
                            }

                            case 3: {
                                ArrayList<Product> listPrice3 = productService.findByPrice(100_000, (int) Math.pow(2, 31) - 1);
                                if (listPrice3.isEmpty()) {
                                    System.out.println("Không có sản phẩm nào có mức giá từ 100000 trở lên");
                                } else {
                                    System.out.println("Sản phẩm có mức giá từ 100000 trở lên bao gồm: ");
                                    productService.printInfo(listPrice3);
                                    System.out.println();
                                }
                                break;
                            }

                            case 4: {
                                isContinuePrice = false;
                                break;
                            }

                            default: {
                                System.out.println("Lựa chọn không hợp lệ");
                                break;
                            }
                        }
                    }
                    break;
                }

                case 6: {
                    isContinues = false;
                    break;
                }

                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    System.out.println();
                    break;
                }
            }
        }
    }

    //Tạo menu chính
    public void mainMenu() {
        System.out.println("**********Menu**********");
        System.out.println("1. Xem danh sách sản phẩm");
        System.out.println("2. Tìm sản phẩm theo tên");
        System.out.println("3. Tìm sản phẩm theo Id");
        System.out.println("4. Tìm sản phẩm có số lượng dưới 5");
        System.out.println("5. Tìm sản phẩm theo mức giá");
        System.out.println("6. Thoát\n");
    }

    //Tạo menu tìm kiếm theo Id
    public void subMenuId() {
        System.out.println("**********Menu**********");
        System.out.println("1. Xóa sản phẩm");
        System.out.println("2. Cập nhật số lượng sản phẩm");
        System.out.println("3. Thoát\n");
    }

    //Tạo menu tìm kiếm theo mức giá
    public void subMenuPrice() {
        System.out.println("***************Menu***************");
        System.out.println("1. Sảm phẩm có mức giá dưới 50000");
        System.out.println("2. Sản phẩm có mức giá từ 50000 đến dưới 100000");
        System.out.println("3. Sản phẩm có mức giá từ 100000 trở lên");
        System.out.println("4. Thoat\n");
    }

}
