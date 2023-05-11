
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService message = new MessagingService();
        System.out.println(message.getMessages());
        Message m = new Message("Sender", "This is the message");
        message.add(m);
        System.out.println(message.getMessages());
    }
}
