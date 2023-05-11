
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(2);
        number.add(6);
        number.add(-1);
        number.add(5);
        number.add(1);
        
        printNumbersInRange(number,3,10);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number: numbers) {
            if (number <= upperLimit && number >= lowerLimit){
                System.out.println(number);
            }
        }
    }
    
}
