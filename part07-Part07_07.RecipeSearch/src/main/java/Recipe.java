import java.util.ArrayList;
import java.util.Objects;

public class Recipe {
    private String name;
    private int cookTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookTime){
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = new ArrayList<>();
    }

    public Recipe(String name){
        this.name = name;
        this.cookTime = 0;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        if (ingredient.isEmpty()) {
            return;
        }
        if (ingredients.contains(ingredient)) {
            return;
        }
        ingredients.add(ingredient);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String toString() {       
        return name+", cooking time: "+cookTime;
    }    
    
    public boolean equalsByName(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recipe)) {
            return false;
        }                
        Recipe otherRecipe = (Recipe) obj;
        return this.getName().contains(otherRecipe.getName());
    }

    public boolean equalsByCookTime(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recipe)) {
            return false;
        }                
        Recipe otherRecipe = (Recipe) obj;
        return this.getCookTime() <= otherRecipe.getCookTime();
    }

    public boolean equalsByIngredients(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recipe)) {
            return false;
        }                
        Recipe otherRecipe = (Recipe) obj;
        ArrayList<String> searchIngredients = otherRecipe.getIngredients();

        return ingredients.containsAll(searchIngredients);
    }
}
