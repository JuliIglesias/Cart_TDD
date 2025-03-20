import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

  public static final Product PAPAS = new Product("Papas");

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
    cart1.addProduct(PAPAS);
    assertFalse(cart1.isEmpty());
  }

  @Test
  void RemoveProductFromCart_004() {
    Cart cart1 = new Cart();
    Product product1 = PAPAS;
    cart1.addProduct(product1);
    assertFalse(cart1.isEmpty());

    cart1.removeProduct(product1);
    assertTrue(cart1.isEmpty());
  }

  @Test
  void EmptyACart_005() {
    Cart cart1 = new Cart();
    cart1.addProduct(PAPAS);
    assertFalse(cart1.isEmpty());

    cart1.removeAllProducts();
    assertTrue(cart1.isEmpty());
  }

  @Test
  void RemoveProductFromEmptyCart_006() {
    Cart cart1 = new Cart();
    Product product1 = PAPAS;
    cart1.removeProduct(product1);
    assertTrue(cart1.isEmpty());
  }

  @Test
  void RemoveAllProductsFromEmptyCart_007() {
    Cart cart1 = new Cart();
    cart1.removeAllProducts();
    assertTrue(cart1.isEmpty());
  }

  @Test
  void AddMoreThan1ProductToCart_008() {
    Cart cart1 = new Cart();
    cart1.addProduct(PAPAS);
    cart1.addProduct(PAPAS);

    assertFalse(cart1.isEmpty());
    assertEquals(2, cart1.getProducts().size());
  }
}
