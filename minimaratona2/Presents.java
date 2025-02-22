import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] gifts = new int[n];
        for (int i = 0; i < n; i++) {
            int recipient = scanner.nextInt();
            gifts[recipient - 1] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(gifts[i] + " ");
        }
        scanner.close();
    }
}
