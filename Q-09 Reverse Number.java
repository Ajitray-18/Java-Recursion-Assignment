import java.util.Scanner;
public class Main {
static long reverse(int n, long reversed) {
    if (n == 0) {
        return reversed;
    }
    return reverse(n / 10, reversed * 10 + n % 10);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long number = Math.abs((long) n);
    long result = reverse((int) number, 0);
    if (n < 0) {
        result = -result;
    }
    System.out.println(result);
    sc.close();
}
}
