import java.util.Arrays;
import java.util.Scanner;

public class ChessForThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int[] scores = new int[3];
            for (int j = 0; j < 3; j++) {
                scores[j] = scanner.nextInt();
            }
            int result = calculateMaxDraws(scores);
            System.out.println(result);
        }

        scanner.close();
    }

    private static int calculateMaxDraws(int[] scores) {
        int draws = 0;

        while (!check(scores)) {
            Arrays.sort(scores);
            scores[1]--;
            scores[2]--;
            draws++;
        }

        if ((scores[0] + scores[1] + scores[2]) % 2 != 0) {
            return -1;
        }

        return draws;
    }

    private static boolean check(int[] scores) {
        int count = 0;
        for (int score : scores) {
            if (score == 0) {
                count++;
            }
        }
        return count >= 2;
    }
}