import java.util.Scanner;

public class Prefiquence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt(); 

        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt(); 
            int m = scanner.nextInt(); 
            String a = scanner.next(); 
            String b = scanner.next(); 

            int maxK = findMaxK(a, b);
            System.out.println(maxK);
        }

        scanner.close();
    }

    private static int findMaxK(String a, String b) {
        int k = 0; 
        int indexB = 0; 

        for (int indexA = 0; indexA < a.length() && indexB < b.length(); indexA++) {
            char currentCharA = a.charAt(indexA);

            
            while (indexB < b.length() && b.charAt(indexB) != currentCharA) {
                indexB++;
            }
            
            if (indexB < b.length() && b.charAt(indexB) == currentCharA) {
                k++;
                indexB++; 
            } else {
                break; 
            }
        }

        return k;
    }
}