import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

  @Test
  void CreateProduct_001() {
    Product product = new Product("Arroz");
    assertNotNull(product);
  }

  @Test
  void TwoEqualProductsBasedOnTheirNames_002(){
    Product product1 = new Product("Arroz");
    Product product2 = new Product("ARROZ");

    assertEquals(product1, product2);
    assertEquals(product1.hashCode(), product2.hashCode());
  }

  @Test
  void TwoDifferentProductsBecauseOfTheirNames_003(){
    Product product1 = new Product("Arroz");
    Product product2 = new Product("Fideos");

    assertNotEquals(product1, product2);
    assertNotEquals(product1.hashCode(), product2.hashCode());
  }
}
