import java.util.*;

public class StaticRangeSumQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();

        long[] x = new long[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextLong();
        }

        long[] prefix = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + x[i - 1];
        }

        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(prefix[b] - prefix[a - 1]);
        }

        scanner.close();
    }
}