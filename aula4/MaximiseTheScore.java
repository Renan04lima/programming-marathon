import java.util.Arrays;
import java.util.Scanner;

public class MaximiseTheScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] array = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(maxScore(array, n));
        }
        scanner.close();
    }

    private static int maxScore(int[] array, int n) {
        Arrays.sort(array);
        int score = 0;
        for (int i = 0; i < 2 * n; i += 2) {
            score += array[i];
        }
        return score;
    }
}