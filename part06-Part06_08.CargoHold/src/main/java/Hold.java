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
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.total() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        String output = "";
        if (this.suitcases.isEmpty()) {
            return output += "0 suitcases " + "(" + this.total() + " kg)";
        }
        
        if (this.suitcases.size() == 1) {
            return output += this.suitcases.size() + " suitcase (" + this.total() + " kg)";
        }
        
        return output += this.suitcases.size() + " suitcases (" + this.total() + " kg)";
    }
    
    public int total() {
        int sum = 0;
        for (Suitcase s : suitcases) {
            sum += s.totalWeight();
        }
        return sum;
    }
    
    public void printItems() {
        for (Suitcase s : suitcases) {
            s.printItems();
        }
    }
    
    
}
