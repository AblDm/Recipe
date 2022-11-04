import java.util.Objects;

public class Product {

    private final double prise;
    private final String good;

    public String getGood() {
        return good;
    }

    private final  double count;



    public Product (double prise, String good, double weight)  {
        if (good!=null && !good.isBlank () && prise>0){
            this.prise = prise;
            this.count = weight;
            this.good = good;}
        else {
            throw new RuntimeException ("Заполните правильно карточку товара: " + good);}


    }
    public void addProducts (Product product){
        addProducts (product);
    }

    @Override
    public String toString() {
        return "\n" + "Product{" +
                "prise=" + prise +
                ", good='" + good + '\'' +
                ", value=" + count +
                '}' ;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Product product = (Product) o;
        return Double.compare (product.prise, prise) == 0 && Double.compare (product.count, count) == 0 && Objects.equals (good, product.good);
    }

    @Override
    public int hashCode() {
        return Objects.hash (prise, good, count);
    }

    public double getPrise() {
        return prise;
    }

    public double getCount() {
        return count;
    }
}
