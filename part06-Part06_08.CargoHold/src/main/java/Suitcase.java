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
public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    
    
    public Suitcase (int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem (Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }  
    }
    
    public String toString() {
        
        String output = "";
        
        if (this.items.isEmpty()) {
            return output += "no items (" + this.totalWeight() + " kg)";
        }
        
        if (this.items.size() == 1) {
            return output += this.items.size() + " item (" + this.totalWeight() + " kg)";
        }
        
        return output += this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
    
    public int totalWeight() {
        int sum = 0;
        for (Item i : items) {
            sum += i.getWeight();
        }
        return sum;
    }
    
    public void printItems() {
        for (Item i : items) {
            System.out.println(i.getName() + " (" + i.getWeight() + " kg)");
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item returnObj = this.items.get(0);
        for (Item i : items) {
            if (returnObj.getWeight() < i.getWeight()) {
                returnObj = i;
            }
        }
        return returnObj;
    }
    
   
}
