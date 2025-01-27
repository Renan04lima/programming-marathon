import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
            }
            System.out.println(minMovesToMakeGood(array));
        }
        scanner.close();
    }

    private static int minMovesToMakeGood(int[] array) {
        int oddIndexEvenCount = 0;
        int evenIndexOddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] % 2 != 0) {
                evenIndexOddCount++;
            } else if (i % 2 != 0 && array[i] % 2 == 0) {
                oddIndexEvenCount++;
            }
        }

        return oddIndexEvenCount == evenIndexOddCount ? oddIndexEvenCount : -1;
    }
}
