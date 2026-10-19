import java.util.Scanner;
public class Main {
static long sumDigits(long n) {
    if (n == 0) {
        return 0;
    }
    return n % 10 + sumDigits(n / 10);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    n = Math.abs(n);
    System.out.println(sumDigits(n));
    sc.close();
}
}
