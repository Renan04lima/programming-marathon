import java.util.Scanner;

public class MaximumInTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[][] table = new int[n][n];

        for (int i = 0; i < n; i++) {
            table[i][0] = 1;
            table[0][i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                table[i][j] = table[i - 1][j] + table[i][j - 1];
            }
        }

        System.out.println(table[n - 1][n - 1]);
    }
}
