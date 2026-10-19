import java.util.Scanner;
public class Main{
static long power(int base, int exponent) {
    if (exponent == 0) {
        return 1;
    }
    return base * power(base, exponent - 1);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int base = sc.nextInt();
    int exponent = sc.nextInt();
    if (exponent < 0) {
        System.out.println();
    } else {
        System.out.println(power(base, exponent));
    }
    sc.close();
}
}
