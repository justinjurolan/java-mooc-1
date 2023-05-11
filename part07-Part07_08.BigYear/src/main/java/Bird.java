/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */
public class Bird {
    
    private String name;
    private String latinName;
    private int observation;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observation + " observations"; 
    }
    
   public String getName() {
       return this.name;
   }
   
   public String getLatinName() {
       return this.latinName;
   }
   
   public int getObservationCount() {
       return this.observation;
   }
   
   public void increaseObservationCountByOne() {
       this.observation++;
   }
   
   
    
    
}
