import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String stones = scanner.next();
        scanner.close();
        
        System.out.println(countStonesToRemove(n, stones));
    }

    private static int countStonesToRemove(int n, String stones) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (stones.charAt(i) == stones.charAt(i - 1)) {
                count++;
            }
        }
        return count;
    }
}
