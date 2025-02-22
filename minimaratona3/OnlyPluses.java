import java.util.Scanner;
 
public class OnlyPluses {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
 
        Integer n = input.nextInt();
 
        int[][] multipleBananas = new int[n][3];
        for (Integer i = 0; i < n; i++) {
            for (Integer j = 0; j < 3; j++) {
                multipleBananas[i][j] = input.nextInt();
            }
        }
        for (Integer i = 0; i < n; i++) {
 
            for (Integer round = 0; round < 5; round++) {
                Integer smaller = 999;
                Integer indexSmaller = 0;
                for (Integer j = 0; j < 3; j++) {
                    if (multipleBananas[i][j] < smaller) {
                        smaller = multipleBananas[i][j];
                        indexSmaller = j;
                    }
                }
                multipleBananas[i][indexSmaller] = smaller + 1;
            }
        }
 
        Integer result = 1;
        for (Integer i = 0; i < n; i++) {
            for (Integer j = 0; j < 3; j++) {
                result *= multipleBananas[i][j];
            }
            System.out.println(result);
            result = 1;
        }
        input.close();
    }
}
 