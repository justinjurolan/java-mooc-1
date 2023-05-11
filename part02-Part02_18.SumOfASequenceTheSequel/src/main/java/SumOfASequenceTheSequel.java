
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number? ");
        int firstNumber = scanner.nextInt();
        System.out.println("Last number? ");
        int secondNumber = scanner.nextInt();
        
        int sum = 0;
        while (firstNumber <= secondNumber) {
            sum += firstNumber;
            firstNumber++;
        }
        System.out.println("The sum is: " + sum);
    }
}
