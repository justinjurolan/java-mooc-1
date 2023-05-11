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
import java.util.Random;

public class JokeManager {
    
    private ArrayList<String> jokesList;
    
    
    public JokeManager() {
        this.jokesList = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokesList.add(joke);
    }
    
    public String drawJoke() {
        String output = "";
        if (this.jokesList.isEmpty()) {
            return output += "Jokes are in short supply.";
        }
        Random rand = new Random();
        int upperBound = this.jokesList.size();
        int int_random = rand.nextInt(upperBound);
        output += this.jokesList.get(int_random);
        return output;
    }
    
    public void printJokes() {
        for (String s : this.jokesList) {
            System.out.println(s);
        }
    }
    
    
}
