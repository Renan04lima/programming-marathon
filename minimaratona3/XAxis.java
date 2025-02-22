import java.util.Arrays;
import java.util.Scanner;

public class XAxis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int[] a = new int[3];

            for (int i = 0; i < 3; i++) {
                a[i] = scanner.nextInt();
            }

            // ordem crescente
            Arrays.sort(a);

            int sum = a[2] - a[0];

            // Imprimir o resultado
            System.out.println(sum);
        }
        scanner.close();
    }
}