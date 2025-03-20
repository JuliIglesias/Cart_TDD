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
class CatalogTest {

  @Test
  void CreateCatalogAlwaysStartsWithDateValidationAndListOfPrices_001() throws IllegalArgumentException {
    HashMap<Product, Integer> PriceList = new HashMap<>();
    assertThrows(IllegalArgumentException.class, () -> new Catalog(new Date(), PriceList));
  }
}