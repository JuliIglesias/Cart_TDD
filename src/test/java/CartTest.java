import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
