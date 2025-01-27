import java.util.Scanner;

public class LittleNikita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(canObtainCubes(n, m) ? "Yes" : "No");
        }
        scanner.close();
    }

    private static boolean canObtainCubes(int n, int m) {
        return n >= m && (n - m) % 2 == 0;
    }
}
