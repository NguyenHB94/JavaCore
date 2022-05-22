package controller;

import model.Movie;
import service.MovieService;

import java.util.List;
import java.util.Scanner;

public class MovieController {
    public MovieService movieService = new MovieService();
    Scanner sc = new Scanner(System.in);

    public void run() {
        boolean isContinue = true;
        int option = 0;

        while (isContinue) {
            showMenu();
            System.out.println("Nhập lựa chọn: ");
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                //System.out.println("Lựa chọn không phù hợp");
                //break;
                option = 0;
            }
            System.out.println();

            switch (option) {
                case 1 : {
                    System.out.println("Danh sách tất cả các phim gồm có: ");
                    movieService.showInfo();
                    break;
                }

                case 2 : {
                    System.out.println("Danh sách phim sắp xếp theo tên: ");
                    movieService.sortByName();
                    break;
                }

                case 3 : {
                    System.out.println("Danh sách phim theo thời lượng giảm dần: ");
                    movieService.sortByLength();
                    break;
                }

                case 4 : {
                    System.out.println("Danh sách phim theo số lượt xem giảm dần: ");
                    movieService.sortByView();
                    break;
                }
                case 5 : {
                    movieService.countMovieByCategry();
                    break;
                }

                case 6 : {
                    isContinue = false;
                    break;
                }

                default: {
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
                }
            }
        }
    }

    //Đọc file và lấy dữ liệu
    //In thông tin các bộ phim ra màn hình
    //Sắp xếp phim theo tên
    //Sắp xếp phim theo thời lượng
    //Sắp xếp phim theo lượt xem
    //Đếm mỗi thể loại có bao nhiêu bộ phim

    public void showMenu() {
        System.out.println("**********MENU**********");
        System.out.println("1. In ra thông tin tất cả các phim");
        System.out.println("2. Sắp xếp phim theo tên");
        System.out.println("3. Sắp xếp phim theo thời lượng");
        System.out.println("4. Sắp xếp phium theo lượt xem");
        System.out.println("5. Đếm số bộ phim mỗi thể loại");
        System.out.println("6. Thoát\n");
    }
}
