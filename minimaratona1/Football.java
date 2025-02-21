import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String players = scanner.next();
        scanner.close();

        System.out.println(isDangerous(players) ? "YES" : "NO");
    }

    private static boolean isDangerous(String players) {
        return players.contains("0000000") || players.contains("1111111");
    }
}
