import java.util.Scanner;
public class Main{
static int gcd(int a, int b) {
    if (b == 0) {
        return Math.abs(a);
    }
    return gcd(b, a % b);
}
static long lcm(int a, int b) {
    if (a == 0 || b == 0) {
        return 0;
    }
    return Math.abs((long) a / gcd(a, b) * b);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(lcm(a, b));
    sc.close();
}
}
