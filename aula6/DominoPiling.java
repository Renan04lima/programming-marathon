import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(maxDominoes(m, n));
        scanner.close();
    }

    private static int maxDominoes(int m, int n) {
        return (m * n) / 2;
    }
}
