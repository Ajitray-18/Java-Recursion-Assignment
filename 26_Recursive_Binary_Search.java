import java.util.Scanner;
class Main {
    static int search(int[] a, int x, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (a[mid] >= x) {
            int result = search(a, x, left, mid - 1);
            if (result != -1) return result;
            return a[mid] == x ? mid : -1;
        }
        return search(a, x, mid + 1, right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print(search(a, x, 0, n - 1));
    }
}
