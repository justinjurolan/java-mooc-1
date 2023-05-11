
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String currentStr = scanner.nextLine();
            if (currentStr.equals("")) {
                break;
            }
            
            String[] pieces = currentStr.split(" ");
            System.out.println(pieces[pieces.length - 1]);
        }

    }
}
