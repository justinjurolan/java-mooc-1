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

public class Recipes {
    
    private String name;
    private int duration;
    private ArrayList<String> ingredients;
    
    public Recipes (String recipeName, int cookingTime) {
        this.name = recipeName;
        this.duration = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.duration;
    }
    
    public String getRecipeName() {
        return this.name;
    }
    
    public int getCookingTime() {
        return this.duration;
    }
    
    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }
    
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    
}
