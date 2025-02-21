import java.util.*;

public class ProfitableInterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if (a >= b) {
                System.out.println(a);
            } else {
                if (2 * a >= b) {
                    System.out.println(2 * a - b);
                } else {
                    System.out.println(0);
                }
            }
        }
        scanner.close();
    }
}