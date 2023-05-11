
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word: ");
        String printThis = scanner.nextLine();
        System.out.print(printThis.repeat(3));
//        for (int i = 0; i < 3; i++) {
//            System.out.print(printThis);
//        }

    }
}
