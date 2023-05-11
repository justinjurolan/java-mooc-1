
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter count = new Counter(5);
        System.out.println(count);
        count.decrease(2);
        System.out.println(count);
        count.increase();
        System.out.println(count);
    }
}
