public class Operator {
    public static void main(String[] args) {

        int a = 30;
        int b = 10;

        // toán tử ++, --
        int c = a++;


        System.out.println(c);// c = a = 30
        System.out.println(a);// a = a +1 = 31

        int d = ++a;
        System.out.println(d);// d = a + 1 = a = 32

        int e = a++ + ++b;
        System.out.println(a);// a = a + 1 = 33
        System.out.println(b);// b = b + 1 = 11
        System.out.println(e);// e = a + b + 1 = 43

        int f = ++a + ++b;
        System.out.println(a);// a = a + 1 = 34
        System.out.println(b);// b = b + 1 = 12
        System.out.println(f);// f = a + 1 + b + 1 = 46

        //toán tử và: &&
        boolean cotien = true;
        boolean troidep = true;

        System.out.println(cotien && troidep);

        //toán tử hoặc ||
        System.out.println(cotien || !troidep);

        int number = 20;

        //number = number + 10;
        number += 10;
        //number = number - 10;
        number -= 10;

        System.out.println(number);
    }
}
