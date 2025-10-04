import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RecipeFileHandler {

    public static List<Recipe> readRecipesFromFile(String filePath) {
        List<Recipe> foundRecipes = new ArrayList<>();
        Recipe actualRecipe = null;
        File file = new File(filePath);
        if (!file.exists()) {
            System.err.println("Error: El archivo '" + filePath + "' no existe.");
            return foundRecipes; // Lista vacía
        }
        
        if (!file.canRead()) {
            System.err.println("Error: No se puede leer el archivo '" + filePath + "'.");
            return foundRecipes;
        }
        // 0: Esperando Nombre, 1: Esperando Tiempo, 2+: Esperando Ingredientes
        int stateCounter = 0; 

        try (Scanner scanner = new Scanner(file)) {
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String cleanLine = line.trim();

                if (cleanLine.isEmpty()) {
                    // Fin de Receta: La línea vacía es el separador.
                    if (actualRecipe != null) {
                        actualRecipe = null; // Reiniciar la receta
                        stateCounter = 0;   // Reiniciar el contador de estado
                    }
                    continue; // Saltar a la siguiente línea
                }

                if (actualRecipe == null) {
                    // Estado 0: Encontramos el Nombre de la Receta
                    actualRecipe = new Recipe(cleanLine);
                    foundRecipes.add(actualRecipe);
                    stateCounter = 1; // Esperamos el Tiempo
                } else if (stateCounter == 1) {
                    // Estado 1: Encontramos el Tiempo de Cocción
                    try {
                        actualRecipe.setCookTime(Integer.parseInt(cleanLine));
                        stateCounter = 2; // Esperamos los Ingredientes
                    } catch (NumberFormatException e) {
                        System.err.println("Advertencia: No se pudo parsear el tiempo de " + actualRecipe.getName() + ". Línea: " + cleanLine);
                    }
                } else if (stateCounter >= 2) {
                    // Estado 2+: Encontramos un Ingrediente
                    actualRecipe.addIngredient(cleanLine);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo no fue encontrado en la ruta especificada. " + e.getMessage());
        }

        return foundRecipes;
    }
}
