import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] difficulties = new int[n];
            for (int i = 0; i < n; i++) {
                difficulties[i] = scanner.nextInt();
            }
            System.out.println(minProblemsToRemove(difficulties, k));
        }
        scanner.close();
    }

    private static int minProblemsToRemove(int[] difficulties, int k) {
        Arrays.sort(difficulties);
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < difficulties.length; i++) {
            if (difficulties[i] - difficulties[i - 1] <= k) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        maxLength = Math.max(maxLength, currentLength);
        return difficulties.length - maxLength;
    }
}
