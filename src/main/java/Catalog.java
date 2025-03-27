import java.util.Date;
import java.util.HashMap;


public class Catalog {
  private final Date validationDate;
  private final HashMap<Product, Integer> priceList;

  // cada variable tiene un rol, y eso debe reflejarse en el nombre de la variable
  public Catalog(Date date, HashMap<Product, Integer> priceList) {
    if (priceList.isEmpty()) {
      throw new IllegalArgumentException("Price list must not be empty");
    }
    this.validationDate = date;
    this.priceList = priceList;
  }

  public int getPriceOf(Product product) throws IllegalArgumentException {
    if (!priceList.containsKey(product)) {
      throw new IllegalArgumentException("Product not found");
    }
    return priceList.get(product);
  }

  public void addProductBy(Product product, int i) {
    priceList.put(product, i);
  }
}
