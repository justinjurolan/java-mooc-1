/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scan;
    private JokeManager jokes;
    
    public UserInterface(JokeManager joke, Scanner scanner) {
        this.jokes = joke;
        this.scan = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scan.nextLine();
            
            if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String jokeTobeAdded = scan.nextLine();
                this.addJoke(jokeTobeAdded);
                continue;
            }
            
            if (command.equals("2")) {
                drawJokes();
            }
            
            if (command.equals("3")) {
                printJokes();
            }
            
            if (command.equals("X")) {
                break;
            } 
        }
    }
    
    public void addJoke(String joke) {
        this.jokes.addJoke(joke);
    }
    
    public void drawJokes() {
        System.out.println(this.jokes.drawJoke());
    }
    
    public void printJokes() {
        this.jokes.printJokes();
    }
    
}
