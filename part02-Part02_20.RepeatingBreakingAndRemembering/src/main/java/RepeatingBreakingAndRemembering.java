
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int input = scanner.nextInt();
        evenAndOdd(input, scanner);
        
    }
    
    public static void reading (int num, Scanner sc) {
        while (num >= 0) {
            num = sc.nextInt();
        }
        System.out.println("Thx! Bye!");
    }
    
    public static void sumOfNumbers(int num, Scanner sc) {
        int sum = 0;
        while (num >= 0) {
            sum += num;
            num = sc.nextInt();
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
    }
    
    public static void sumOfNumbersAndNumbers(int num, Scanner sc) {
        int sum = 0;
        int counter = 0;
        while (num >= 0) {
            sum += num;
            counter++;
            num = sc.nextInt();
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
    }
    
    public static void averageOfNumbers(int num, Scanner sc) {
        int sum = 0;
        int counter = 0;
        while (num >= 0) {
            sum += num;
            counter++;
            num = sc.nextInt();
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (double) sum / counter);
    }
    
    public static void evenAndOdd(int num, Scanner sc) {
        int sum = 0;
        int counter = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        while (num >= 0) {
            
            if (num % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
            
            sum += num;
            counter++;
            num = sc.nextInt();
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + (double) sum / counter);
        System.out.println("Even: " + evenCounter);
        System.out.println("Odd: " + oddCounter);
    }
    
}
