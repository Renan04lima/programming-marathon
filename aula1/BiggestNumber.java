import java.util.Scanner;

// https://neps.academy/br/exercise/323
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer n = scanner.nextInt();
        Integer biggestNumber = 0;
        do {
            n = scanner.nextInt();
            if(n > biggestNumber){
                biggestNumber = n;
            }
        } while (n != 0);

        System.out.println(biggestNumber);
        
        scanner.close();
    }
}
