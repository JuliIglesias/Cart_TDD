import java.util.ArrayList;
import java.util.List;

public class Cart {

  private final List<Product> products;

  public Cart(List<Product> products) {
    this.products = products;
  }

  public Cart() {
    this.products = new ArrayList<>();
  }

  public boolean isEmpty() {
    return products.isEmpty();
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public void removeProduct(Product product) {
    products.clear();
  }
}
