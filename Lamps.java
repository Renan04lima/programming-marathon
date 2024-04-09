import java.util.Scanner;

// https://neps.academy/br/exercise/52
public class Lamps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = scanner.nextInt();

        boolean lamp1 = false;
        boolean lamp2 = false;


        for(int i = 0; i < n; i++){
            Integer lamp = scanner.nextInt();
            if(lamp == 1){
                lamp1 = !lamp1;
            }
            if(lamp == 2){
                lamp1 = !lamp1;
                lamp2 = !lamp2;
            }
        }
        

        System.out.println(lamp1 ? 1 : 0);
        System.out.println(lamp2 ? 1 : 0);

        scanner.close();
    }
}
