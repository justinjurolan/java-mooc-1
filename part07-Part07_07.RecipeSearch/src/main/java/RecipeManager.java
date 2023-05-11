/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author justin
 */

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeManager {
    
    private ArrayList<String> ingredients;
    private ArrayList<Recipes> listOfRecipes;
    
    public RecipeManager() {
        this.ingredients = new ArrayList<>();
        this.listOfRecipes = new ArrayList<>();
    }
    
    public void readRecipe(String fileName) {
        try (Scanner input = new Scanner(Paths.get(fileName))) {
            while (input.hasNextLine()) {
                String recipeName = input.nextLine();
                int cookingTime = Integer.valueOf(input.nextLine());
                Recipes recipe = new Recipes(recipeName, cookingTime);
                listOfRecipes.add(recipe);
                while (input.hasNextLine()) {
                    String ingredients = input.nextLine();
                    if (ingredients.isEmpty()) {
                        break;
                    }
                    recipe.addIngredients(ingredients);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void listRecipes() {
        for (Recipes recipe : listOfRecipes) {
            System.out.println(recipe);
        }
    }
    
    public void listRecipesByName (String recipeName) {
        for (Recipes recipe : this.listOfRecipes) {
            if (recipe.getRecipeName().contains(recipeName)) {
                System.out.println(recipe);
            }
        }
    }
    
    public void listRecipeByCookingTime (int cookingTime) {
        for (Recipes recipe : this.listOfRecipes ) {
            if (recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe);
            }
        }
    }
    
    public void listRecipesByIngredients(String ingredient) {
        for (Recipes recipe : this.listOfRecipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
    
}
