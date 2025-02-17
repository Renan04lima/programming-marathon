import java.util.Scanner;

public class ThornsAndCoins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String path = scanner.next();
            int result = maxCoins(n, path);
            System.out.println(result);
        }

        scanner.close();
    }

    private static int maxCoins(int n, String path) {
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            if (dp[i] == -1) continue; 

            if (i + 1 < n && path.charAt(i + 1) != '*') {
                dp[i + 1] = Math.max(dp[i + 1], dp[i] + (path.charAt(i + 1) == '@' ? 1 : 0));
            }

            if (i + 2 < n && path.charAt(i + 2) != '*') {
                dp[i + 2] = Math.max(dp[i + 2], dp[i] + (path.charAt(i + 2) == '@' ? 1 : 0));
            }
        }

        int maxCoins = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i] != -1) {
                maxCoins = Math.max(maxCoins, dp[i]);
            }
        }

        return maxCoins;
    }
}