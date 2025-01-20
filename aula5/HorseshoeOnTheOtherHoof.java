import java.util.*;

public class HorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> horseshoes = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            horseshoes.add(scanner.nextInt());
        }
        scanner.close();
        
        System.out.println(4 - horseshoes.size());
    }
}
