import java.util.Arrays;
import java.util.Scanner;

public class MahmoudAndTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] segments = new int[n];
        for (int i = 0; i < n; i++) {
            segments[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(canFormTriangle(segments) ? "YES" : "NO");
    }

    private static boolean canFormTriangle(int[] segments) {
        Arrays.sort(segments);
        for (int i = 0; i < segments.length - 2; i++) {
            if (segments[i] + segments[i + 1] > segments[i + 2]) {
                return true;
            }
        }
        return false;
    }
}
