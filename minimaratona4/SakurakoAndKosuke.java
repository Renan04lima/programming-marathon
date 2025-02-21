import java.util.*;

public class SakurakoAndKosuke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(determineLastMove(n));
        }
        scanner.close();
    }

    private static String determineLastMove(int n) {
        int position = 0;
        int move = 1;
        boolean sakurakoTurn = true;
        while (Math.abs(position) <= n) {
            if (sakurakoTurn) {
                position -= move;
            } else {
                position += move;
            }
            move += 2;
            sakurakoTurn = !sakurakoTurn;
        }
        return sakurakoTurn ? "Kosuke" : "Sakurako";
    }
}
