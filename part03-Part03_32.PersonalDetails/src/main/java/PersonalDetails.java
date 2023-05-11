
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int index = 0;
       String longestName = "";
       ArrayList<Integer> numbers = new ArrayList<>();
       
        while (true) {
            String myStr = scanner.nextLine().trim();
            if (myStr.equals("")) {
                break;
            }
            
            String[] piece = myStr.split(",");
            numbers.add(Integer.valueOf(piece[1]));
            for (int i = 0; i < piece.length; i++) {
                if (index < piece[0].length()) {
                    index = piece[0].length();
                    longestName = piece[0];
                }
            }
            
        }
        System.out.println("Longest name: " + longestName);
        printAverageYears(numbers);
        

    }
    
    public static void printLongestName(ArrayList<String> string) {
        String longestName = "";
        int index = 0;
        for (int i = 0; i < string.size(); i++) {
            if (index < string.get(i).length()) {
                index = string.get(i).length();
                longestName = string.get(i);
            }
        }
        System.out.println("Longest name: " + longestName);
    }
    
    public static void printAverageYears(ArrayList<Integer> numbers) {
        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            sum += num;
            count++;
        }
        System.out.println("Average of the birth years: " + (double) sum / count);
        
    }
}
