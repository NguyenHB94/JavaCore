package demo_overload;

public class Calculator {
    // 2 tham số
    public int sum(int a, int b){
        return a + b;
    }

    //3 tham số
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    //khác kiểu dữ liệu
    public double sum(double a, double b) {
        return a + b;
    }

    //Lỗi do khác kiểu trả về nhưng cùng kiểu dữ liệu parameter
//    public double sum(int a, int b) {
//        return a + b;
//    }

}
