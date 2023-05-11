
import java.util.Scanner;



public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String fileName = scanner.nextLine();
        RecipeManager recipeManager = new RecipeManager();
        recipeManager.readRecipe(fileName);
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
            
        while (true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            switch (command) {
                case "list":
                    System.out.println("");
                    System.out.println("Recipes: ");
                    recipeManager.listRecipes();
                    break;
                case "find name":
                    System.out.println("Searched word: ");
                    String recipeName = scanner.nextLine();
                    System.out.println("");
                    System.out.println("Recipes: ");
                    recipeManager.listRecipesByName(recipeName);
                    System.out.println("");
                    break;
                case "find cooking time":
                    System.out.println("Max cooking time: ");
                    int cookingTime = Integer.valueOf(scanner.nextLine());
                    System.out.println("Recipes: ");
                    recipeManager.listRecipeByCookingTime(cookingTime);
                    System.out.println("");
                    break;
                case "find ingredient":
                    System.out.println("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    System.out.println("Recipes: ");
                    recipeManager.listRecipesByIngredients(ingredient);
                    System.out.println("");
                    break;
                case "stop":
                    return;
            }
        }
        
        
    }

}
