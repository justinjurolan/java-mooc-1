
import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {-1,3,1,2};
        System.out.println("Index of Smallest: " + MainProgram.indexOfSmallestFrom(array,1));
        
    }
    
    public static int smallest(int[] array) {
        int small = array[0];
        for (int i = 0; i < array.length; i++) {
            if (small > array[i]) {
                small = array[i];
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int first = array[index];
            if (first > array[i]) {
                System.out.println("Comparison: " + first + " " + array[i]);
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[index] > table[i]) {
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            System.out.println(Arrays.toString(array));
            MainProgram.swap(array, index, i);
        }
    }

}
