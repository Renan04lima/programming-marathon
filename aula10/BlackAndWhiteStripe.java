import java.util.Scanner;

public class BlackAndWhiteStripe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String s = scanner.next();
            System.out.println(minRepaints(s, k));
        }
        scanner.close();
    }

    private static int minRepaints(String s, int k) {
        int minRepaints = Integer.MAX_VALUE;

        for (int i = 0; i <= s.length() - k; i++) {
            int repaints = 0;
            for (int j = i; j < i + k; j++) {
                if (s.charAt(j) == 'W') {
                    repaints++;
                }
            }
            minRepaints = Math.min(minRepaints, repaints);
        }

        return minRepaints;
    }
}
