/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
import java.util.ArrayList;
public class MessagingService {
    private ArrayList<Message> message;
    
    public MessagingService () {
        this.message = new ArrayList<>();
    }
    
    public void add(Message messages) {
        int messageContentLength = messages.getContent().length();
        if (messageContentLength <= 280) {
            this.message.add(messages);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.message;
    }
     
}
