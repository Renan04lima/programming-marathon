import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }

        int minCoins = calculateMinCoins(coins);
        System.out.println(minCoins);
        scanner.close();
    }

    private static int calculateMinCoins(int[] coins) {
        Arrays.sort(coins);
        reverseArray(coins);

        int totalSum = 0;
        for (int coin : coins) {
            totalSum += coin;
        }

        int mySum = 0;
        int count = 0;

        for (int coin : coins) {
            mySum += coin;
            count++;
            if (mySum > totalSum / 2) {
                break;
            }
        }

        return count;
    }

    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}