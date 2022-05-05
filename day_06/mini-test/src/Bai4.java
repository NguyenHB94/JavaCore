public class Bai4 {
    public static void main(String[] args) {
        System.out.println("10 số nguyên tố đầu tiên là: ");
        first10Primes();
        System.out.println();
        System.out.println("Các số nguyên tố nhỏ hơn 10 là: ");
        primesLessthan10();

    }
    public static void first10Primes(){
        int count = 0;
        for (int i = 2; ;i++){
            if(checkPrimeNumber(i)){
                count++;
                System.out.print(i + "\t");
                if (count == 10){
                    break;
                }
            }
        }
    }

    public static void primesLessthan10(){
        for (int i = 2; i < 10; i++){
            if (checkPrimeNumber(i)){
                System.out.print(i + "\t");
            }
        }
    }

    public static boolean checkPrimeNumber(int n){
        if (n < 2){
            return false;
        }
        int countlimit = (int)Math.sqrt(n);
        for (int i = 2; i <= countlimit; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
