public class Cashier {
  public int totalPriceOf(Cart cart, Catalog catalog) {
    int total = 0;
    // asi se rompe el encapsulamiento xq expones la estructura interna,
    // para no romperlo se podría implementar un visitor para que ejecute sobre su estructura interna de cart, es un acoplamiento válido hasta ahí

    for (Product product : cart.getProducts()) {
      total += catalog.getPriceOf(product);
    }
    return total;
  }
}
