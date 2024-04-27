import java.util.Scanner;

public class MostUnstableArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(calculateMaxUnstableValue(n, m));
        }
        
        scanner.close();
    }

    private static int calculateMaxUnstableValue(int n, int m) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return m;
        } else {
            return 2 * m;
        }
    }
}
