import java.util.Scanner;

// https://codeforces.com/problemset/problem/4/A
public class Watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer n = scanner.nextInt();
       
        if(n == 2){
            System.out.println("NO");
        } else {
            System.out.println(n % 2 == 0 ? "YES" : "NO");
        }
        
        scanner.close();
    }
}
