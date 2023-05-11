
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;


        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
           String[] parts = input.split(" ");
           String commands = parts[0];
           int integerVal = Integer.valueOf(parts[1]);
           
           if (commands.equals("add")) {
               if (integerVal + firstContainer >= 100) {
                   firstContainer = 100;
                   continue;
               } 
               if (firstContainer <= 100 && integerVal > 0){
                   firstContainer += integerVal;
               }
           }
           
           if (commands.equals("move")) {
               
               if (integerVal + secondContainer >= 100) {
                   secondContainer = 100;
                   firstContainer -= secondContainer;
                   continue;
               } 
               
               if (integerVal > firstContainer) {
                   secondContainer += firstContainer;
                   firstContainer = 0;
               }
               
               if (integerVal > 0 && firstContainer - integerVal >= 0) {
                   secondContainer += integerVal;
                   firstContainer -= integerVal;
               }
           }
           
           if (commands.equals("remove")) {
               
               if (secondContainer <= 0) {
                   continue;
               }
               
               if (secondContainer < integerVal) {
                   secondContainer = 0;
               }
               
               if (secondContainer > integerVal) {
                   secondContainer -= integerVal;
               }
           }

        }
    }

}
