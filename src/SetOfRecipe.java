import java.util.HashSet;
import java.util.Set;

public class SetOfRecipe {
    public static Set<Recipe> recipes = new HashSet<> ();

    public static void addRecipe (Recipe recipe){
        for (var recipeInCollection : recipes) {
            if (recipeInCollection.getNameOfRecipe ().equals (recipe.getNameOfRecipe ())){
                throw new RuntimeException ("Такой рецепт уже есть в книге");
            }
        }
        recipes.add(recipe);
    }

    public static void printAllRecipes() {
        System.out.println ("---Книга рецептов---");
        for (Recipe recipe: recipes) {
            System.out.println (recipe);
        }

    }
}
