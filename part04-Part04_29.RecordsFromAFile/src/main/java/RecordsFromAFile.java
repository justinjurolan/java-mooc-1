
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try (Scanner fileRead = new Scanner(Paths.get(fileName))) {
            while (fileRead.hasNextLine()) {
                String line = fileRead.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] splitWords = line.split(",");
                String name = splitWords[0];
                int age = Integer.valueOf(splitWords[1]);
                if (age > 1 || age == 0) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
