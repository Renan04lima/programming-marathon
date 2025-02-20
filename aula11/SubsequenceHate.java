import java.util.Scanner;

public class SubsequenceHate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            System.out.println(minOperationsToMakeGood(s));
        }
        scanner.close();
    }

    private static int minOperationsToMakeGood(String s) {
        int n = s.length();
        int[] prefixZero = new int[n + 1];
        int[] prefixOne = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            prefixZero[i] = prefixZero[i - 1] + (s.charAt(i - 1) == '0' ? 1 : 0);
            prefixOne[i] = prefixOne[i - 1] + (s.charAt(i - 1) == '1' ? 1 : 0);
        }
        
        int minOperations = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            minOperations = Math.min(minOperations, prefixOne[i] + (prefixZero[n] - prefixZero[i]));
            minOperations = Math.min(minOperations, prefixZero[i] + (prefixOne[n] - prefixOne[i]));
        }
        
        return minOperations;
    }
}
