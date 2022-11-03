import java.util.HashSet;
import java.util.Set;


public class ProductSet {


    public static Set<Product> productSet = new HashSet<> ();


    public static void printSetOfProduct () {
        System.out.println ("----ПРОДУКТЫ----");
        for (Product products : productSet){
            System.out.println (products.getGood ()+ "стоимость:" + products.getPrise () + "колличество упаковок :"+ products.getCount () );
        }
    }

    protected static void addProductToSet (Product newProduct){
        if (!productSet.add (newProduct)){
            throw new RuntimeException ("Продукт ранее был добавлен. проверьте Ваш список покупок");
        }
    }

    public static boolean removeProductFromSet (String goodToRemove) {
        for (Product product : productSet) {
            if (product.getGood ().equals (goodToRemove)){
                productSet.remove (goodToRemove);
                System.out.println ("Продукт " + goodToRemove + "удалён из списка");
                return true;
            }
            System.out.println ("Продукт " + goodToRemove + "не найден в списке");
        }return false;
    }

    public static boolean checkProductOnSet (String goodToCheck) {
        for (Product product : productSet) {
            if (product.getGood ().equals (goodToCheck)){
                System.out.println ("Продукт " + goodToCheck + "уже куплен");
                return true;
            }
        System.out.println ("Продукт " + goodToCheck + "нещё не куплен");
        }return false;
    }


}
