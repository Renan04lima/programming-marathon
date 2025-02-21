import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decoding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        String decodedWord = decodeWord(s);
        System.out.println(decodedWord);
        scanner.close();
    }

    private static String decodeWord(String s) {
        List<Character> decoded = new ArrayList<>();
        int len = s.length();

        while (len > 0) {
            if (len % 2 == 1) {
                // Se o comprimento for ímpar, adiciona o caractere ao final da lista
                decoded.add(s.charAt(0));
            } else {
                // Se o comprimento for par, adiciona o caractere no início da lista
                decoded.add(0, s.charAt(0));
            }
            // Remove o primeiro caractere da string codificada
            s = s.substring(1);
            len = s.length();
        }

        // Converte a lista de caracteres para uma string
        StringBuilder result = new StringBuilder();
        for (char c : decoded) {
            result.append(c);
        }

        return result.toString();
    }
}