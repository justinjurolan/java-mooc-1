
import java.util.ArrayList;

public class NullPointerExceptionProgram {

    public static void main(String[] args) {
        // Implement a program, or modify a program so, that it causes 
        // the NullPointerException -error

       
        Person j = new Person("JJ");
        
        j = null;
        j.growOlder();
        
        

    }
}
