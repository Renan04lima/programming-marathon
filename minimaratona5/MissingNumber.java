import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = n * (n + 1L) / 2;
        for (int i = 0; i < n - 1; i++) {
            sum -= scanner.nextInt();
        }
        System.out.println(sum);
        scanner.close();
    }
}
