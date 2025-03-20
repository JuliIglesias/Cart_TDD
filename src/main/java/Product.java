public class Product {
  private final String name;

  public Product(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  //Se crea el producto antes que un test del mismo, porque no hay comportamiento que testear
}
