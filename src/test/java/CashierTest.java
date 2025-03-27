
/*
Cobrarlo
    -Recibir el metodo de pago
    -Calcular el precio del carrito
        - Aplicar desucnetos
    -Entrega factura depsues de pago

Podria responder el precio de un producto
Anular una compra
*/

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashierTest {
  @Test
  public void CashierKnowsPriceOfCart_001(){
    Product product1 = new Product("product1");
    Product product2 = new Product("product2");
    HashMap<Product, Integer> PriceList = new HashMap<>();
    PriceList.put(product1, 100);
    PriceList.put(product2, 200);
    Catalog catalog = new Catalog(new Date(), PriceList);

    Cart cart = new Cart();
    cart.addProduct(product1);
    cart.addProduct(product2);

    Cashier cashier = new Cashier();

    assertEquals(300, cashier.totalPriceOf(cart, catalog));
  }
}
