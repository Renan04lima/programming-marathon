import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int num = 0;

            for (int i = 1; i <= 10; i++) {
                String row = scanner.next();
                for (int j = 1; j <= 10; j++) {
                    char a = row.charAt(j - 1);
                    if (a == 'X') {
                        num += Math.min(Math.min(i, 10 - i + 1), Math.min(j, 10 - j + 1));
                    }
                }
            }

            System.out.println(num);
        }
        scanner.close();
    }
}