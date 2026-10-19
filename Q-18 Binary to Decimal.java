import java.util.Scanner;
public class Main{
static int binaryToDecimal(String binary, int index) {
    if (index == binary.length()) {
        return 0;
    }
    int digit = binary.charAt(index) - '0';
    return digit * (int) Math.pow(2, binary.length() - 1 - index)
            + binaryToDecimal(binary, index + 1);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String binary = sc.next();
    if (!binary.matches("[01]+")) {
        System.out.println("Please enter a valid binary number.");
    } else {
        System.out.println(binaryToDecimal(binary, 0));
    }
    sc.close();
}
}
