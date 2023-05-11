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

public class BirdManager {
    
    private ArrayList<Bird> listOfBirds;
    
    public BirdManager () {
        this.listOfBirds = new ArrayList<>();
    }
    
    public void addBirdToTheList(String name, String latinName) {
        this.listOfBirds.add(new Bird(name,latinName));
    }
    
    public void addObservation(String name) {
        for (Bird bird : this.listOfBirds) {
            if (bird.getName().equals(name)) {
                bird.increaseObservationCountByOne();
            }
        }
    }
    
    public ArrayList<Bird> getBirdsList() {
        return this.listOfBirds;
    }
    
    public boolean checkBirdsNameInTheList(String name) {
        for (Bird bird : this.listOfBirds) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public void printAllBirds() {
        for (Bird bird : this.listOfBirds) {
            System.out.println(bird);
        }
    }
    
    public void printOneBird(String name) {
        for (Bird bird : this.listOfBirds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                break;
            }
        }
    }
    
}
