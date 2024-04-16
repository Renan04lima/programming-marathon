import java.util.Scanner;

// https://neps.academy/br/exercise/87
public class Fliper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer p = scanner.nextInt();
        Integer r = scanner.nextInt();

        
        if(p == 0){
            System.out.println("C");
        }
        if(p == 1){
            if(r == 0) {
                System.out.println("B");
            } else if(r == 1){
                System.out.println("A");
            }
        }
        

        scanner.close();
    }
}
