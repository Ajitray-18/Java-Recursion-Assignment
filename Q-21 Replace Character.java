import java.util.Scanner;
public class Main{
static String replaceCharacter(String str, char oldChar, char newChar, int index) {
    if (index == str.length()) {
        return "";
    }
    char current = str.charAt(index);
    String remaining = replaceCharacter(str, oldChar, newChar, index + 1);
    if (current == oldChar) {
        return newChar + remaining;
    }
    return current + remaining;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char oldChar = sc.next().charAt(0);
    char newChar = sc.next().charAt(0);
    System.out.println(replaceCharacter(str, oldChar, newChar, 0));
    sc.close();
}
}
