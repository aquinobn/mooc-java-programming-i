import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipeManager recipeManager;

    public UserInterface(Scanner scanner, RecipeManager recipeManager) {
        this.scanner = scanner;
        this.recipeManager = recipeManager;
    }

    public void start() {       

        System.out.println("File to read: ");
        String filePath = scanner.nextLine();        

        boolean loadSuccess = recipeManager.loadRecipesFromFile(filePath);
        if (!loadSuccess) {
            System.out.println("Terminando programa debido a error en carga de archivo.");
            return;
        }

        System.out.println(
            "Commands: \n"+
            "list - list the recipes\n"+
            "stop - stops the program\n"+
            "find name - searches recipes by name\n"+
            "find cooking time - searches recipes by cooking time\n"+
            "find ingredient - searches recipes by ingredient"
        );

        while(true) {
            
            System.out.println("Enter command: ");
            String command = scanner.nextLine();            
            if (command.isEmpty()) {
                continue;
            }

            if (command.toLowerCase().equals("stop")) {
                break;
            }

            if (command.toLowerCase().equals("list")) {
                String recipesString = recipeManager.getRecipesStateAsString();
                System.out.println("Recipes:");
                System.out.println(recipesString);
            }

            if (command.toLowerCase().equals("find name")) {
                System.out.println("Searched word: ");
                String word = scanner.nextLine();
                if(word.isEmpty()) {
                    continue;
                }
                String recipeString = recipeManager.findRecipeByName(word);
                if (recipeString == null) {
                    System.out.println("Receta no encontrada");
                    continue;
                }
                System.out.println("Recipe: "+recipeString);
            }

            if (command.toLowerCase().equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int time = scanner.nextInt();
                if (time <= 0) {
                    continue;
                }
                String recipesString = recipeManager.findRecipeByCookTime(time);
                if (recipesString == null) {
                    System.out.println("Receta no encontrada");
                    continue;
                }
                System.out.println("Recipes: \n"+recipesString);
            }

            if (command.toLowerCase().equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                if(ingredient.isEmpty()) {
                    continue;
                }
                String recipesString = recipeManager.findRecipeByIngredient(ingredient);
                if (recipesString == null) {
                    System.out.println("Receta no encontrada");
                    continue;
                }
                System.out.println("Recipes: \n"+recipesString);                
            }
        }
    }    
}
