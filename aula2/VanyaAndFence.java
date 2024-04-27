import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        
        int totalWidth = 0;
        
        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();
            if (height > h) {
                totalWidth += 2;
            } else {
                totalWidth += 1;
            }
        }
        
        System.out.println(totalWidth);
        
        scanner.close();
    }
}