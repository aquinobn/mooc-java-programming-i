import java.util.ArrayList;
import java.util.List;

public class RecipeManager {

    private ArrayList<Recipe> recipes;

    public RecipeManager () {        
        this.recipes = new ArrayList<>();
    }

    public boolean loadRecipesFromFile(String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            System.err.println("Error: Ruta de archivo no válida.");
            return false;
        }

        List<Recipe> loadedRecipes = RecipeFileHandler.readRecipesFromFile(filePath);
        if (loadedRecipes.isEmpty()) {
            System.out.println("Advertencia: No se encontraron recetas en el archivo o el archivo está vacío.");            
            this.recipes = new ArrayList<>(); 
            return false;
        }

        this.recipes = new ArrayList<>(loadedRecipes);
        return true;
    }
    
    public String getRecipesStateAsString() {
        ArrayList<String> stringRecipes = new ArrayList<>();
        for (Recipe recipe : recipes) {
            stringRecipes.add(recipe.toString());            
        }
        return String.join("\n", stringRecipes);
    }

    public String findRecipeByName(String name) {
     
        if (name.isEmpty() || recipes.size() == 0) {
            return null;
        }        

        ArrayList<String> foundRecipes = new ArrayList<>();
        Recipe searchRecipe = new Recipe(name);        

        for (Recipe recipe : recipes) {
            if (recipe.equalsByName(searchRecipe)) {
                foundRecipes.add(recipe.toString());
            }
        }
        return String.join("\n", foundRecipes);

    }    

    public String findRecipeByCookTime(int cooktime) {        

        if (cooktime <= 0 || recipes.size() == 0) {
            return null;
        }

        ArrayList<String> foundRecipes = new ArrayList<>();
        Recipe searchRecipe = new Recipe("",cooktime);            

        for (Recipe recipe : recipes) {
            if (recipe.equalsByCookTime(searchRecipe)) {
                foundRecipes.add(recipe.toString());
            }
        }
        return String.join("\n", foundRecipes);
    }

     public String findRecipeByIngredient(String name) {        

        if (name.isEmpty() || recipes.size() == 0) {
            return null;
        }

        ArrayList<String> foundRecipes = new ArrayList<>();
        Recipe searchRecipe = new Recipe("compare",0);
        searchRecipe.addIngredient(name);            

        for (Recipe recipe : recipes) {
            if (recipe.equalsByIngredients(searchRecipe)) {
                foundRecipes.add(recipe.toString());
            }
        }
        return String.join("\n", foundRecipes);
    }

}
