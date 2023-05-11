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
    
    private TodoList todos;
    private Scanner scanner;
    
    public UserInterface (TodoList todos, Scanner scanner) {
        this.todos = todos;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String commands = scanner.nextLine();
            if (commands.equals("stop")) {
                break;
            }
            
            if (commands.equals("add")) {
                System.out.println("To add:");
                String toAdd = scanner.nextLine();
                this.todos.add(toAdd);
                continue;
            }
            
            if (commands.equals("list")) {
                this.todos.print();
                continue;
            }
            
            if (commands.equals("remove")) {
                System.out.println("Which one is removed?");
                int indexRemoved = Integer.valueOf(scanner.nextLine());
                this.todos.remove(indexRemoved);
                continue;
            }
        }
    }
    
}
