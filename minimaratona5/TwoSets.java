import java.util.*;

public class TwoSets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long totalSum = (long) n * (n + 1) / 2;

        if (totalSum % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            long targetSum = totalSum / 2;
            List<Integer> set1 = new ArrayList<>();
            List<Integer> set2 = new ArrayList<>();

            for (int i = n; i >= 1; i--) {
                if (i <= targetSum) {
                    set1.add(i);
                    targetSum -= i;
                } else {
                    set2.add(i);
                }
            }

            printSet(set1);
            printSet(set2);
        }
        scanner.close();
    }

    private static void printSet(List<Integer> set) {
        System.out.println(set.size());
        for (int num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}