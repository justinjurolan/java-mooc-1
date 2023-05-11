
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
       

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner read = new Scanner(Paths.get(file))) {
            int counter = 0;
            while (read.hasNextLine()) {
                numbers.add(Integer.valueOf(read.nextLine()));        
            }
            for (Integer number : numbers) {
                if (number >= lowerBound && number <= upperBound) {
                    counter++;
                }
            }
            System.out.println("Numbers: " + counter);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        

    }

}
