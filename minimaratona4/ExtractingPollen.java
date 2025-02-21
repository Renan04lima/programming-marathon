import java.util.*;

public class ExtractingPollen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            maxHeap.add(scanner.nextInt());
        }
        int pollenCollected = 0;

        // coleta de polén
        for (long i = 0; i < k; i++) {
            if (maxHeap.isEmpty()) {
                pollenCollected = 0;
                break;
            }

            int currentFlower = maxHeap.poll();
            int collected = sumOfDigits(currentFlower);
            pollenCollected = collected;

            int remaining = currentFlower - collected;
            if (remaining > 0) {
                maxHeap.add(remaining);
            }
        }

        System.out.println(pollenCollected);
        scanner.close();
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}