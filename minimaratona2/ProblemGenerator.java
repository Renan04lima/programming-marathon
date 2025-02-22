import java.util.Scanner;

public class ProblemGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String a = scanner.next();

            int[] count = new int[7]; // 'A' a 'G' são 7 níveis
            for (char c : a.toCharArray()) {
                count[c - 'A']++;
            }

            int additionalProblems = 0;
            for (int i = 0; i < 7; i++) {
                if (count[i] < m) {
                    additionalProblems += (m - count[i]);
                }
            }

            System.out.println(additionalProblems);
        }
        scanner.close();
    }
}