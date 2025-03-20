import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

  @Test
  void CreateCart_001() {
    Cart cart1 = new Cart();
    assertNotNull(cart1);
  }

  @Test
  void EmptyCart_002() {
    Cart cart1 = new Cart();
    assertTrue(cart1.isEmpty());
  }

  @Test
  void AddProductToCart_003() {
    Cart cart1 = new Cart();
    cart1.addProduct(new Product());
    assertFalse(cart1.isEmpty());
  }

  @Test
  void RemoveProductFromCart_004() {
    Cart cart1 = new Cart();
    cart1.addProduct(new Product());
    assertFalse(cart1.isEmpty());

    cart1.removeProduct(new Product());
    assertTrue(cart1.isEmpty());
  }


}
