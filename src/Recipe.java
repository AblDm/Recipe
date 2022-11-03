import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {


    private final String nameOfRecipe;
    private final Set<Product> products = new HashSet<Product> ();
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
        if (products.contains (product)){
            throw new RuntimeException ("Продукт уже добавлен в рецепт");
        }
        products.add(product);
        totalCostRecipe = totalCostRecipe + product.getCount ()*requiredQuantity;
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

    public Set<Product> getProducts() {
        return products;
    }

    public String getNameOfRecipe() {
        return nameOfRecipe;
    }


    public double getTotalCostRecipe() {
        return totalCostRecipe;
    }
}
