import java.util.*;

public class SkibidusAndOhio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] s = new String[t];
        
        for (int i = 0; i < t; i++) {
            s[i] = scanner.next();
        }

        minimizeStringLength(t, s);
        scanner.close();
    }

    private static void minimizeStringLength(int t, String[] s) {
        for (int i = 0; i < t; i++) {
            int length = s[i].length();
            boolean find = false;

            for (int j = 0; j < length - 1; j++) {
                if (s[i].charAt(j) == s[i].charAt(j + 1)) {
                    find = true;
                    break;
                }
            }

            if (find) {
                length = 1;
            }

            System.out.println(length);
        }
    }
}