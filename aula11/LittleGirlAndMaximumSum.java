import java.util.Arrays;
import java.util.Scanner;

public class LittleGirlAndMaximumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int[] frequency = new int[n + 1];
        for (int i = 0; i < q; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            frequency[l - 1]++;
            if (r < n) {
                frequency[r]--;
            }
        }
        
        for (int i = 1; i < n; i++) {
            frequency[i] += frequency[i - 1];
        }
        
        Arrays.sort(array);
        Arrays.sort(frequency);
        
        long maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum += (long) array[i] * frequency[i];
        }
        
        System.out.println(maxSum);
        scanner.close();
    }
}
