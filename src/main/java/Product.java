import java.util.Objects;

public class Product {
  private final String name;

  public Product(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
  //Se crea el producto antes que un test del mismo, porque no hay comportamiento que testear
  //Producto al imaginarlo, se puede crear sin precio, ya que al pensar en la caja de arroz gallo oro, no pensas en el precio del mismo sino su esencia de la caja de arroz


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return name.equalsIgnoreCase(product.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name.toLowerCase());
  }
}
