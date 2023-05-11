
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);
        
        Suitcase mmCase = new Suitcase(15);
        mmCase.addItem(brick);
        mmCase.addItem(brick);
        
        

        Hold hold = new Hold(10);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);
        hold.addSuitcase(mmCase);

        System.out.println(hold);
        
    }

}
