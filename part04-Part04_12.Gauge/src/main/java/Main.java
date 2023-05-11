
public class Main {

    public static void main(String[] args) {
        // Test your Gauge class here

        Gauge g = new Gauge();

        int c = 0;
        while (c < 10) {
            g.increase();
            c++;
        }
        
        System.out.println(g.value());
        
        c = 0;
        while (c < 10) {
            g.decrease();
            c++;
        }
        
        System.out.println(g.value());
    }
}
