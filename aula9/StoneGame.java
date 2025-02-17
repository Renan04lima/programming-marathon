import java.util.Scanner;

public class StoneGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] stones = new int[n];
            for (int i = 0; i < n; i++) {
                stones[i] = scanner.nextInt();
            }
            System.out.println(minMoves(stones));
        }
        scanner.close();
    }

    private static int minMoves(int[] stones) {
        int n = stones.length;
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (stones[i] < stones[minIndex]) minIndex = i;
            if (stones[i] > stones[maxIndex]) maxIndex = i;
        }

        int leftMost = Math.min(minIndex, maxIndex);
        int rightMost = Math.max(minIndex, maxIndex);

        return Math.min(rightMost + 1, Math.min(n - leftMost, leftMost + 1 + n - rightMost));
    }
}
