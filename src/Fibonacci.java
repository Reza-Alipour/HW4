import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        BigInteger i = new BigInteger(String.valueOf(scanner.nextInt()));
//        System.out.println("fib_rec(" + i + ") = " + fib_rec(i));
        System.out.println("fib_iter(" + i + ") = " + fib_iter(i));
    }

    public static BigInteger fib_rec(BigInteger n) {
        if (n.compareTo(BigInteger.valueOf(0)) == 0) {
            return BigInteger.valueOf(0);
        }
        if (n.compareTo(BigInteger.valueOf(1)) == 0) {
            return BigInteger.valueOf(1);
        }
        return fib_rec(n.subtract(BigInteger.valueOf(1))).add(fib_rec(n.subtract(BigInteger.valueOf(2))));
    }

    public static BigInteger fib_iter(BigInteger n) {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c;
        for (BigInteger i = BigInteger.valueOf(0); i.compareTo(n) < 0; i = i.add(BigInteger.valueOf(1))) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return a;
    }
}