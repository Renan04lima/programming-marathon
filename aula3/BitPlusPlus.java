import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int x = 0;

        for (int i = 0; i < n; i++) {
            String operation = scanner.nextLine();
            if (operation.contains("++")) {
                x++;
            } else if (operation.contains("--")) {
                x--;
            }
        }

        scanner.close();
        System.out.println(x);
    }
}