import java.util.*;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();
        
        System.out.println(findMinimumShovels(k, r));
    }

    private static int findMinimumShovels(int k, int r) {
        for (int i = 1; i <= 10; i++) {
            if ((k * i) % 10 == 0 || (k * i) % 10 == r) {
                return i;
            }
        }
        return 10;
    }
}
