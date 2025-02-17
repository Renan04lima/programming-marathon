import java.util.PriorityQueue;
import java.util.Scanner;

public class ExtractingPollen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < n; i++) {
            maxHeap.add(scanner.nextInt());
        }
        scanner.close();

        int pollenCollected = 0;
        for (long i = 0; i < k; i++) {
            int maxPollen = maxHeap.poll();
            pollenCollected = sumOfDigits(maxPollen);
            maxPollen -= pollenCollected;
            maxHeap.add(maxPollen);
        }
        System.out.println(pollenCollected);
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
