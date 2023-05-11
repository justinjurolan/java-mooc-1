
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] arrayString = {"James", "Johnny", "Jac", "Jab"};
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(3);
        numbers.add(2);
        Main.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("");
        Main.sort(arrayString);
        System.out.println(Arrays.toString(arrayString));
        System.out.println("");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Aa");
        strings.add("Ab");
        strings.add("Az");
        strings.add("Ax");
        System.out.println(numbers);
        Main.sortIntegers(numbers);
        System.out.println(numbers);
        System.out.println("");
        System.out.println(strings);
        Main.sortStrings(strings);
        System.out.println(strings);
        
        
        
    }
    
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
