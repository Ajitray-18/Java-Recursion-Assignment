import java.util.Scanner;
public class Main{
static String removeCharacter(String str, char ch, int index) {
    if (index == str.length()) {
        return "";
    }
    char current = str.charAt(index);
    String remaining = removeCharacter(str, ch, index + 1);
    if (current == ch) {
        return remaining;
    }
    return current + remaining;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char ch = sc.next().charAt(0);
    System.out.println(removeCharacter(str, ch, 0));
    sc.close();
}
}
