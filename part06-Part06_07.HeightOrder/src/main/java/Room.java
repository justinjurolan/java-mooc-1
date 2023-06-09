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
public class Room {
    
    private ArrayList<Person> persons;
    
    public Room () {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        
        Person returnObj = this.persons.get(0);
        
        for (Person p : this.persons) {
            if (returnObj.getHeight() > p.getHeight()) {
                returnObj = p;
            }
        }
        
        return returnObj;  
    }
    
    public Person take() {
       Person shortest = this.shortest();
       this.persons.remove(shortest);
       return shortest;
    }
    
}
