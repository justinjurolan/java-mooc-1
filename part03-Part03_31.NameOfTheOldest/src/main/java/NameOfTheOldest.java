
import java.util.Scanner;


public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int highestAge = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] CSV = input.split(",");
            for (int i = 0; i < CSV.length; i++) {
                if (Integer.valueOf(CSV[1]) > highestAge) {
                    highestAge = Integer.valueOf(CSV[1]);
                    name = CSV[0];
                }
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
    
   
}
