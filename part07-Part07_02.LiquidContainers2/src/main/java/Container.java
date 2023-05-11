/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public class Container {
    
    private int container;
    
    
    public Container() {
        this.container = 0;
    }
    
    public int contains() {
        return this.container;
    }
    
    public void add (int amount) {
        
         if (this.container + amount >= 100) {
             this.container = 100;
             return;
         }
        
         if (amount > 0 && this.container <= 100) {
            this.container += amount;
        }
    }
    
    public void move (int amount) {
           this.add(amount);
    }
    
    public void remove(int amount) {
        
        if (amount > this.container) {
            this.container = 0;
        } 
        
        if (amount > 0 && amount <= this.container) {
            this.container -= amount;
        }
        
    }
    
    public String toString() {
        return this.container + "/100";
    }
    
}
