import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

/*
      Maneja precios de productos
        Agrega productos al catalogo
        Elimina productos del catalogo
        Modifica precios de productos

        Preguntarle al cliente si esto es solo para argentina o para el mundo, si es para el mundo, se deberia agregar un atributo de moneda
*/

// Falta hacer lo del pago del carrito de compras y lo de los descuentos sobre los productos y sobre le metodo de pago


class CatalogTest {

  @Test
  void CreateCatalogAlwaysStartsWithDateValidationAndListOfPrices_001() throws IllegalArgumentException {
    HashMap<Product, Integer> PriceList = new HashMap<>();
    assertThrows(IllegalArgumentException.class, () -> new Catalog(new Date(), PriceList));
  }

  @Test
  void AskPriceOfAProductAndItsExists_002() {
    Product product = new Product("product");
    HashMap<Product, Integer> PriceList = new HashMap<>();
    PriceList.put(product, 100);
    Catalog catalog = new Catalog(new Date(), PriceList);
    assertEquals(100, catalog.getPrice(product));
  }

  @Test
  void AskPriceOfAProductAndItNotExists_003() {
    Product product = new Product("product1");
    HashMap<Product, Integer> PriceList = new HashMap<>();
    PriceList.put(product, 100);
    Product product2 = new Product("product2");

    Catalog catalog = new Catalog(new Date(), PriceList);
    assertEquals(0, catalog.getPrice(product2));
  }

  @Test
  public void AddProductToCatalog_004() {
    Product product = new Product("product");
    Product product1 = new Product("product1");
    HashMap<Product, Integer> PriceList = new HashMap<>();
    PriceList.put(product1, 1000);
    Catalog catalog = new Catalog(new Date(), PriceList);
    catalog.addProduct(product, 100);
    assertEquals(100, catalog.getPrice(product));
  }

  @Test
  public void CatalogWithMultipleProducts_005() {
    Product product1 = new Product("product1");
    Product product2 = new Product("product2");
    HashMap<Product, Integer> PriceList = new HashMap<>();
    PriceList.put(product1, 100);
    PriceList.put(product2, 200);
    Catalog catalog = new Catalog(new Date(), PriceList);
    assertEquals(100, catalog.getPrice(product1));
    assertEquals(200, catalog.getPrice(product2));
  }

  @Test
  public void CatalogDoesNotKnowAboutAProduct_006() {
    Product product1 = new Product("product1");
    Product product2 = new Product("product2");
    HashMap<Product, Integer> PriceList = new HashMap<>();
    PriceList.put(product1, 100);
    Catalog catalog = new Catalog(new Date(), PriceList);
    assertEquals(100, catalog.getPrice(product1));
    assertEquals(0, catalog.getPrice(product2));
  }
}