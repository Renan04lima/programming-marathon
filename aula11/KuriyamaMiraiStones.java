import java.util.Arrays;
import java.util.Scanner;

public class KuriyamaMiraiStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] costs = new long[n];
        for (int i = 0; i < n; i++) {
            costs[i] = scanner.nextLong();
        }
        
        long[] sortedCosts = Arrays.copyOf(costs, n);
        Arrays.sort(sortedCosts);
        
        long[] prefixSum = new long[n + 1];
        long[] sortedPrefixSum = new long[n + 1];
        
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + costs[i - 1];
            sortedPrefixSum[i] = sortedPrefixSum[i - 1] + sortedCosts[i - 1];
        }
        
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int type = scanner.nextInt();
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            if (type == 1) {
                System.out.println(prefixSum[r] - prefixSum[l - 1]);
            } else {
                System.out.println(sortedPrefixSum[r] - sortedPrefixSum[l - 1]);
            }
        }
        scanner.close();
    }
}
