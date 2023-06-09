
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
       
            System.out.println("");
        }
        
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < height - 2; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < 3; k++) {
                System.out.print("*");
            }
            
            
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        
        
  //      printTriangle(10);
//        System.out.println("---");
  //     christmasTree(4);
//        System.out.println("---");
        christmasTree(10);
    }
}
