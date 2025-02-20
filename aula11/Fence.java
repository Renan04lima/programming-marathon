import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] heights = new int[n];
        
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        
        System.out.println(findMinHeightIndex(n, k, heights));
        scanner.close();
    }

    private static int findMinHeightIndex(int n, int k, int[] heights) {
        int minSum = 0;
        for (int i = 0; i < k; i++) {
            minSum += heights[i];
        }
        
        int currentSum = minSum;
        int minIndex = 0;
        
        for (int i = k; i < n; i++) {
            currentSum += heights[i] - heights[i - k];
            if (currentSum < minSum) {
                minSum = currentSum;
                minIndex = i - k + 1;
            }
        }
        
        return minIndex + 1;
    }
}
