
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while (true) {
            String currentStr = scanner.nextLine();
            if (currentStr.equals("")) {
                break;
            }
            
            String[] piece = currentStr.split(",");
            if (oldest < Integer.valueOf(piece[1])) {
                oldest = Integer.valueOf(piece[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
