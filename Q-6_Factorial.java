import java.util.Scanner;
public class Main {
static long fact(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    return n * fact(n - 1);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n < 0) {
        System.out.println("not defined.");
    } else if (n > 20) {
        System.out.println("Num too large.");
    } else {
        System.out.println(fact(n));
    }
    sc.close();
}
}
