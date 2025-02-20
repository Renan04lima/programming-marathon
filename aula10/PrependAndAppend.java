import java.util.Scanner;

public class PrependAndAppend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            String s = scanner.next();
            System.out.println(findShortestOriginalLength(s));
        }
        scanner.close();
    }

    private static int findShortestOriginalLength(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right && s.charAt(left) != s.charAt(right)) {
            left++;
            right--;
        }

        return right - left + 1;
    }
}
