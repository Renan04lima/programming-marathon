import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EffectiveApproach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> positionMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            positionMap.put(a[i], i + 1);
        }
        int m = scanner.nextInt();
        long vasyaComparisons = 0;
        long petyaComparisons = 0;
        for (int i = 0; i < m; i++) {
            int b = scanner.nextInt();
            int pos = positionMap.get(b);
            vasyaComparisons += pos;
            petyaComparisons += (n - pos + 1);
        }
        System.out.println(vasyaComparisons + " " + petyaComparisons);
        scanner.close();
    }
}

