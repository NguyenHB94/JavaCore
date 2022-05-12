class Wrapper {
    public static void main(String[] args) {

        // Định nghĩa các biến thuộc kiểu dữ liệu nguyên thủy
        int a = 5;
        double b = 5.65;

        // Chuyển đổi thành wrapper objects tương ứng
//        Integer aObj = Integer.valueOf(a);
//        Double bObj = Double.valueOf(b);
        Integer aObj = a;
        Double bObj = b;

        if(aObj instanceof Integer) {
            System.out.println("Một object thuộc Integer đã được tạo.");
        }

        if(bObj instanceof Double) {
            System.out.println("Một object thuộc Double đã được tạo.");
        }

        //Chuyển đổi thành primitive type
        int aPrimitive = aObj.intValue();
        double bPrimitive = bObj.doubleValue();

        System.out.println("Giá trị của a = " + aPrimitive);
        System.out.println("Giá trị của b = " + bPrimitive);

    }
}
