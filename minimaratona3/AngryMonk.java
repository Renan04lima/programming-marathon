import java.util.Arrays;
import java.util.Scanner;

public class AngryMonk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[k]; 

            for (int i = 0; i < k; i++) {
                a[i] = scanner.nextInt();
            }

            // ordem crescente
            Arrays.sort(a);

            int sum = 0;
            for (int i = 0; i < k - 1; i++) {
                sum += 2 * (a[i] - 1);
            }
            sum += k - 1;

            // Imprimir o resultado
            System.out.println(sum);
        }
        scanner.close();
    }
}