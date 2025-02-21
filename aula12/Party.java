import java.util.*;

public class Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] managers = new int[n + 1]; // managers[0] is unused

        for (int i = 1; i <= n; i++) {
            managers[i] = scanner.nextInt();
        }

        int minGroups = calculateMinGroups(n, managers);
        System.out.println(minGroups);
        scanner.close();
    }

    private static int calculateMinGroups(int n, int[] managers) {
        int[] depth = new int[n + 1];
        int maxDepth = 0;

        for (int i = 1; i <= n; i++) {
            int currentDepth = 0;
            int currentEmployee = i;

            while (managers[currentEmployee] != -1) {
                currentDepth++;
                currentEmployee = managers[currentEmployee];
            }

            depth[i] = currentDepth;
            maxDepth = Math.max(maxDepth, currentDepth);
        }

        return maxDepth + 1;
    }
}