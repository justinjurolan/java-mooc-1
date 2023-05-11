
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        while (true) {
            int inputNum = Integer.valueOf(scanner.nextLine());
            if (inputNum == -1){
                break;
            }
            listOfNumbers.add(inputNum);
        }
        System.out.println("");
        int sum = 0;
        int count = 0;
        for (Integer numbers: listOfNumbers) {
            count++;
            sum += numbers;
        }
        System.out.println("Average: " + (double) sum / count);
        
        
    }
}
