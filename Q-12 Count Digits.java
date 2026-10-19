import java.util.Scanner;
public class Main{
static int countDigits(long n) {
    if (n < 10) {
        return 1;
    }
    return 1 + countDigits(n / 10);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = Math.abs(sc.nextLong());
    System.out.println(countDigits(n));
    sc.close();
}
}
