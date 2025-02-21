import java.util.*;

public class SkibidusAndAmogu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String singular = scanner.next();
            System.out.println(convertToPlural(singular));
        }
        scanner.close();
    }

    private static String convertToPlural(String singular) {
        return singular.substring(0, singular.length() - 2) + "i";
    }
}
