import java.util.*;

public class ParityAndSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] numbers = new long[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextLong();
            }

            long maxOdd = 0, maxEven = 0;
            for (long value : numbers) {
                if (value % 2 == 1) {
                    maxOdd = Math.max(maxOdd, value);
                } else {
                    maxEven = Math.max(maxEven, value);
                }
            }

            boolean sameParity = true;
            for (int i = 1; i < n; i++) {
                if (numbers[i] % 2 != numbers[0] % 2) {
                    sameParity = false;
                    break;
                }
            }

            if (sameParity) {
                System.out.println("0");
                continue;
            }

            Arrays.sort(numbers);
            int operations = 0;
            for (int i = 0; i < n; i++) {
                if (numbers[i] % 2 == 0 && numbers[i] < maxOdd) {
                    numbers[i] += maxOdd;
                    maxOdd = Math.max(maxOdd, numbers[i]);
                    operations++;
                }
            }

            sameParity = true;
            for (int i = 1; i < n; i++) {
                if (numbers[i] % 2 != numbers[0] % 2) {
                    sameParity = false;
                    break;
                }
            }

            if (sameParity) {
                System.out.println(operations);
                continue;
            }

            int index = -1;
            for (int i = 0; i < n; i++) {
                if (numbers[i] == maxOdd) {
                    index = i;
                    break;
                }
            }

            numbers[index] = maxOdd + maxEven;
            operations++;

            for (long value : numbers) {
                if (value % 2 == 0) {
                    operations++;
                }
            }

            System.out.println(operations);
        }

        scanner.close();
    }
}