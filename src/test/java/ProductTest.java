import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductTest {

  @Test
  void CreateProduct_001() {
    Product product = new Product("Arroz");
    assertNotNull(product);
  }

  @Test
  void TwoEqualProducts_002(){
    Product product1 = new Product("Arroz");
    Product product2 = new Product("ARROZ");

    assertEquals(product1, product2);
    assertEquals(product1.hashCode(), product2.hashCode());
  }
}
