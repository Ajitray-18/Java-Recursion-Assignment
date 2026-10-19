import java.util.Scanner;
public class Main{
static int countOccurrences(String str, char ch, int index) {
    if (index == str.length()) {
        return 0;
    }
    int count = (str.charAt(index) == ch) ? 1 : 0;
    return count + countOccurrences(str, ch, index + 1);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char ch = sc.next().charAt(0);
    System.out.println(countOccurrences(str, ch, 0));
    sc.close();
}
}
