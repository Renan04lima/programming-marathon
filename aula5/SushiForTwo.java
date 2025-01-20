import java.util.*;

public class SushiForTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] sushi = new int[n];
        for (int i = 0; i < n; i++) {
            sushi[i] = scanner.nextInt();
        }
        scanner.close();
        
        System.out.println(findLongestSegment(sushi));
    }

    private static int findLongestSegment(int[] sushi) {
        int maxSegment = 0;
        int tunaCount = 0;
        int eelCount = 0;
        int prevType = sushi[0];
        
        for (int i = 0; i < sushi.length; i++) {
            if (sushi[i] == 1) {
                if (prevType == 2) {
                    maxSegment = Math.max(maxSegment, 2 * Math.min(tunaCount, eelCount));
                    tunaCount = 0;
                }
                tunaCount++;
            } else {
                if (prevType == 1) {
                    maxSegment = Math.max(maxSegment, 2 * Math.min(tunaCount, eelCount));
                    eelCount = 0;
                }
                eelCount++;
            }
            prevType = sushi[i];
        }
        maxSegment = Math.max(maxSegment, 2 * Math.min(tunaCount, eelCount));
        return maxSegment;
    }
}
