import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        scanner.close();
        
        System.out.println(determineGender(username));
    }

    private static String determineGender(String username) {
        HashSet<Character> distinctChars = new HashSet<>();
        for (char c : username.toCharArray()) {
            distinctChars.add(c);
        }
        return distinctChars.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!";
    }
}
