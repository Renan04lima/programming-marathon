import java.util.Scanner;

public class SumInBinaryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            System.out.println(calculateSum(n));
        }
        scanner.close();
    }

    private static long calculateSum(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n;
            n /= 2;
        }
        return sum;
    }
}
