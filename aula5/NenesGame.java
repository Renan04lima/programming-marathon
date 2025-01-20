import java.util.*;

public class NenesGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int k = scanner.nextInt();
            int q = scanner.nextInt();
            int[] a = new int[k];
            for (int i = 0; i < k; i++) {
                a[i] = scanner.nextInt();
            }
            int[] n = new int[q];
            for (int i = 0; i < q; i++) {
                n[i] = scanner.nextInt();
            }
            for (int ni : n) {
                System.out.print(findWinners(ni, a) + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static int findWinners(int n, int[] a) {
        List<Integer> players = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            players.add(i);
        }
        boolean kickedOut;
        do {
            kickedOut = false;
            List<Integer> toRemove = new ArrayList<>();
            for (int ai : a) {
                if (ai <= players.size()) {
                    toRemove.add(players.get(ai - 1));
                }
            }
            if (!toRemove.isEmpty()) {
                kickedOut = true;
                players.removeAll(toRemove);
            }
        } while (kickedOut);
        return players.size();
    }
}
