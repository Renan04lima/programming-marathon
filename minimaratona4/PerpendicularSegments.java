import java.util.*;

public class PerpendicularSegments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int k = scanner.nextInt();
            x = Math.min(x, y);
            findSegments(x, k);
        }
        scanner.close();
    }

    private static void findSegments(int x, int k) {
        System.out.println("0 0 " + x + " " + x);
        System.out.println("0 " + x + " " + x + " 0");
    }
}