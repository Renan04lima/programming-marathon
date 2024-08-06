import java.util.Scanner;

public class TurtlePuzzle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(maxSumAfterOperations(array));
        }
        scanner.close();
    }

    private static int maxSumAfterOperations(int[] array) {
        int totalSum = 0;
        for (int num : array) {
            totalSum += Math.abs(num);
        }
        return totalSum;
    }
}