import java.util.Scanner;

public class ContinuedFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        long[] a = new long[N + 1];
        a[0] = 1; 
        if (N >= 1) {
            a[1] = 1;
        }

        for (int i = 2; i <= N; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        System.out.println(a[N]);
        scanner.close();
    }
}