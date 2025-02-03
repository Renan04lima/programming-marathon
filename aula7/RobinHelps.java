import java.util.Scanner;

public class RobinHelps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] gold = new int[n];
            for (int j = 0; j < n; j++) {
                gold[j] = scanner.nextInt();
            }
            System.out.println(countPeopleGivenGold(n, k, gold));
        }
        scanner.close();
    }

    private static int countPeopleGivenGold(int n, int k, int[] gold) {
        int robinGold = 0;
        int peopleGivenGold = 0;

        for (int i = 0; i < n; i++) {
            if (gold[i] >= k) {
                robinGold += gold[i];
            } else if (gold[i] == 0 && robinGold > 0) {
                robinGold--;
                peopleGivenGold++;
            }
        }

        return peopleGivenGold;
    }
}
