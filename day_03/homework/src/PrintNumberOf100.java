public class PrintNumberOf100 {
    public static void main(String[] args) {

        PrintNumber();

    }

    public static void PrintNumber(){
//        for (int i = 1; i <= 100; i++){
//            if(i % 5 ==0 && i % 3 == 0 ){
//                System.out.print("FizzBuzz" +"\t");
//                continue;
//            } else if (i % 5 == 0) {
//                System.out.print("Buzz" +"\t");
//                continue;
//            } else if (i % 3 == 0) {
//                System.out.print("Fizz" +"\t");
//                continue;
//            }
//            System.out.print(i +"\t");
//        }

        for (int i = 1; i <= 100; i++){
            if(i % 5 ==0 && i % 3 == 0 ){
                System.out.print("FizzBuzz" +"\t");
            } else if (i % 5 == 0) {
                System.out.print("Buzz" +"\t");
            } else if (i % 3 == 0) {
                System.out.print("Fizz" +"\t");
            }else {
                System.out.print(i + "\t");
            }
        }

    }
}
