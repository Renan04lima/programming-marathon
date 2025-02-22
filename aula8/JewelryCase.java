import java.util.Scanner;

public class JewelryCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        for (int r = 0; r < 4; r++) {
            if (isValid(matrix)) {
                System.out.println(r);
                return;
            }
            matrix = rotateCounterClockwise(matrix);
        }
    }

    // verificar se a matriz é válida (crescente em linhas e colunas)
    private static boolean isValid(int[][] matrix) {
        int N = matrix.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (matrix[i][j] >= matrix[i][j + 1]) {
                    return false;
                }
            }
        }
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N - 1; i++) {
                if (matrix[i][j] >= matrix[i + 1][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // rotacionar a matriz 90 graus no sentido anti-horário
    private static int[][] rotateCounterClockwise(int[][] matrix) {
        int N = matrix.length;
        int[][] rotated = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                rotated[N - j - 1][i] = matrix[i][j];
            }
        }
        return rotated;
    }
}