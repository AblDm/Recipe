import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Recipe {


    private final String nameOfRecipe;
    //private final Set<Product> products = new HashSet<Product> ();
    private final Map<Product, Integer> products = new HashMap<> ();
    private double totalCostRecipe;

    public Recipe(String nameOfRecipe) {
        this.nameOfRecipe = nameOfRecipe;
        this.totalCostRecipe = 0;
        SetOfRecipe.recipes.add (this);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "nameOfRecipe='" + nameOfRecipe + '\'' +
                ", products=" + products +
                ", totalCostRecipe=" + totalCostRecipe +
                '}';
    }

    public void addProductToRecipe(Product product, double requiredQuantity){
        if (products.containsKey (product)) {
            throw new RuntimeException ("Что то не так");
        }
        products.put (product, (int) requiredQuantity);

        totalCostRecipe = totalCostRecipe + product.getCount ()*requiredQuantity;
    }

    public int getCostForProduct () {
        int sum = 0;
        for ( var key : products.keySet ()){

            sum += products.get (key) * key.getPrise ();
        }
        return sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Recipe recipe = (Recipe) o;
        return Double.compare (recipe.totalCostRecipe, totalCostRecipe) == 0 && Objects.equals (nameOfRecipe, recipe.nameOfRecipe) && Objects.equals (products, recipe.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash (nameOfRecipe, products, totalCostRecipe);
    }



    public String getNameOfRecipe() {
        return nameOfRecipe;
    }


    public double getTotalCostRecipe() {
        return totalCostRecipe;
    }
}
