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

  public int getPrice(Product product) {
    return priceList.getOrDefault(product, 0);
  }

  public void addProduct(Product product, int i) {
    priceList.put(product, i);
  }
}
