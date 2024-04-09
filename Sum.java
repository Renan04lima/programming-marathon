import java.util.Scanner;

// https://neps.academy/br/exercise/84
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer x = scanner.nextInt();
        Integer y = scanner.nextInt();

        System.out.println(x + y);

        scanner.close();
    }
}
