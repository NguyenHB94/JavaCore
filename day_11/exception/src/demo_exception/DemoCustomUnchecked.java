package demo_exception;

public class DemoCustomUnchecked {
    public static void main(String[] args) {
        try {
            findElement(6);
        } catch (NotFoundExceptions e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean findElement(int value) {
        int[] numbers = {1,2,3,4,5};
        for (int number : numbers) {
            if (number == value) {
                 return  true;
            }
        }
        throw new NotFoundExceptions("Không tìm thấy phần tử có già trị = " +value);
    }
}
