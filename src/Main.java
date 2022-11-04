public class Main {




    public static void main(String[] args) {


        ProductSet.addProductToSet(new Product (10,"яйцо",12));
        ProductSet.addProductToSet  (new Product (10,"молоко",12));
        ProductSet.addProductToSet (new Product (10,"мука",12));
        ProductSet.addProductToSet  (new Product (10," сыр",12));
        ProductSet.addProductToSet (new Product (10,"томат",12));
        ProductSet.addProductToSet (new Product (10,"Картофель",12));

        Recipe omlet = new Recipe ("Омлет");
       omlet.addProductToRecipe(new Product (10,"яйцо",12),2);
       omlet.addProductToRecipe(new Product (10,"молоко",12),1);


       SetOfRecipe.printAllRecipes ();










    }

}