import java.util.Scanner;
public class Main{
static long productDigits(long n) {
    if (n < 10) {
        return n;
    }
    return (n % 10) * productDigits(n / 10);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = Math.abs(sc.nextLong());
    System.out.println(productDigits(n));
    sc.close();
}
}
