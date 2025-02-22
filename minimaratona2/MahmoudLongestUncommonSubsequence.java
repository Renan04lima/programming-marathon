import java.util.Scanner;

public class MahmoudLongestUncommonSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println(-1);
        } else {
            System.out.println(Math.max(a.length(), b.length()));
        }
        scanner.close();
    }
}