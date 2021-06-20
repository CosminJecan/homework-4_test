import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long n;
        long fact = 1;

        System.out.println("\t" + "Introduceti numarul dorit:");
        n = new Scanner(System.in).nextLong();

        for (long i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.println("Factorialul numarului introdus = " + fact + ".");
    }
}
