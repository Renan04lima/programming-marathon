import java.util.Scanner;

public class OneDEraser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            String s = scanner.next();
            System.out.println(minOperations(s, k));
        }
        scanner.close();
    }

    private static int minOperations(String s, int k) {
        int operations = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'B') {
                operations++;
                i += k;
            } else {
                i++;
            }
        }

        return operations;
    }
}
