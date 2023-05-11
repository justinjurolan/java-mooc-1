
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String currentStr = scanner.nextLine();
            if (currentStr.equals("")) {
                break;
            }
            String[] pieces = currentStr.split(" ");
            for (String piece : pieces) {
                if (piece.contains("av")) {
                    System.out.println(piece);
                }
            }
        }

    }
}
