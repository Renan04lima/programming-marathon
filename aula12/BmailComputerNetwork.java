import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BmailComputerNetwork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] routers = new int[n];
        for (int i = 1; i < n; i++) {
            routers[i] = scanner.nextInt();
        }
        scanner.close();
        List<Integer> path = findPath(routers, n);
        for (int router : path) {
            System.out.print(router + " ");
        }
    }

    private static List<Integer> findPath(int[] routers, int n) {
        List<Integer> path = new ArrayList<>();
        while (n > 0) {
            path.add(0, n);
            n = routers[n - 1];
        }
        return path;
    }
}
