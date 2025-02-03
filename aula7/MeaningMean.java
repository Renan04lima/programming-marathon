import java.util.*;

public class MeaningMean {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }

            Collections.sort(arr);

            while (arr.size() > 1) {
                int a = arr.get(0);
                int b = arr.get(1);

                int newElement = (a + b) / 2;

                arr.remove(0);
                arr.remove(0);

                int pos = Collections.binarySearch(arr, newElement);
                if (pos < 0) {
                    pos = -(pos + 1);
                }
                arr.add(pos, newElement);
            }

            System.out.println(arr.get(0));
        }

        scanner.close();
    }
}