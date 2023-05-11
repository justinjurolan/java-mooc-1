
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String myString = scanner.nextLine();
            if (myString.equals("")) {
                break;
            }
            String[] pieces = myString.split(" ");
            for (String piece : pieces) {
                System.out.println(piece);
            }
        }
        

    }
}
