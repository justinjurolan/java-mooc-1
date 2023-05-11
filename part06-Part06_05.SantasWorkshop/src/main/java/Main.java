
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        Gift book = new Gift("Harry Potter", 2);
        Gift shoes = new Gift("NIKEEEE", 5);
        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(shoes);
        System.out.println(gifts.totalWeight());
    }
}
