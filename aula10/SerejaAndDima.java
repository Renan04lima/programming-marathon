import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }
        scanner.close();

        int serejaScore = 0;
        int dimaScore = 0;
        boolean serejaTurn = true;

        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (cards[left] > cards[right]) {
                if (serejaTurn) {
                    serejaScore += cards[left];
                } else {
                    dimaScore += cards[left];
                }
                left++;
            } else {
                if (serejaTurn) {
                    serejaScore += cards[right];
                } else {
                    dimaScore += cards[right];
                }
                right--;
            }
            serejaTurn = !serejaTurn;
        }

        System.out.println(serejaScore + " " + dimaScore);
    }
}
