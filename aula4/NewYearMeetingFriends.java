import java.util.Arrays;
import java.util.Scanner;

public class NewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] positions = new int[3];
        for (int i = 0; i < 3; i++) {
            positions[i] = scanner.nextInt();
        }
        Arrays.sort(positions);
        int minDistance = positions[2] - positions[0];
        System.out.println(minDistance);
        scanner.close();
    }
}
