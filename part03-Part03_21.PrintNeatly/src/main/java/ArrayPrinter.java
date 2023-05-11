
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {56, 25, 142, 25, 138, 117, 36, 24, 69, 17, 125, 120, 7, 5, 92, 40, 112, 108, 90, 58, 102, 75, 43, 13, 102, 120, 35, 145, 139, 26, 68, 98, 100, 81, 115, 93, 96, 71, 91, 61, 64, 109, 61, 110, 109, 61, 137, 51, 82, 76, 60, 52, 127, 52, 45, 141, 148, 29, 81, 1, 12, 124, 144, 31, 13, 17, 13, 83, 115, 105, 21, 47, 61, 8, 29, 72, 115, 61, 88, 2, 112, 59, 142, 32, 77, 0, 132, 44, 73, 97, 92, 1, 55, 25, 89, 77, 107, 13, 139, 75};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
