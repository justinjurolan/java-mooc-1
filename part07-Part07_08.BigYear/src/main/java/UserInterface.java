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
    
    private Scanner scanner;
    private BirdManager birdManager;
    
    public UserInterface(Scanner scanner, BirdManager birdManager) {
        this.scanner = scanner;
        this.birdManager = birdManager;
    }
    
    public void start() {
        while (true) {
            System.out.println("?");
            String commands = scanner.nextLine();
            switch (commands) {
                case "Add":
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Name in Latin: ");
                    String latinName = scanner.nextLine();
                    this.birdManager.addBirdToTheList(name, latinName);
                    break;
                case "Observation":
                    System.out.println("Bird?");
                    String observationName = scanner.nextLine();
                    if (this.birdManager.checkBirdsNameInTheList(observationName)) {
                        this.birdManager.addObservation(observationName);
                    } else {
                        System.out.println("Not a bird!");
                    }
                    break;
                case "One":
                    System.out.println("Bird? ");
                    String birdName = scanner.nextLine();
                    this.birdManager.printOneBird(birdName);
                    break;
                case "All":
                    this.birdManager.printAllBirds();
                    break;
                case "Quit":
                    return;
            }
        }
    }
    
    
}
