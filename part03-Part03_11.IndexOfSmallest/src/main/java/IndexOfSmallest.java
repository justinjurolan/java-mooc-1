
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int inputNum = Integer.valueOf(scanner.nextLine());
            if (inputNum == 9999) {
                break;
            }
            numbers.add(inputNum);
        }
        System.out.println("");
        // Getting the smallest value
        int smallestVal = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int currentVal = numbers.get(i);
            if (currentVal <= smallestVal) {
                smallestVal = currentVal;
            }  
        }
        System.out.println("Smallest number: " + smallestVal);
        
        
        // Printing the index of the smallest value
        for (int i = 0; i < numbers.size(); i++) {
            int currentVal = numbers.get(i);
            if (smallestVal == currentVal) {
                System.out.println("Found at index: " + i);
            }
        }
        
    }
}
