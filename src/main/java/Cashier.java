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

  public Invoice charge(Cart cart, Catalog catalog, CreditCard creditCard, IMerchantProcessor merchantProcessor) {
    int totalPrice = totalPriceOf(cart, catalog);

    //new MerchantProcessor(); NUNCA se debe instanciar en el método0, se debe pasar como parámetro
    // API para cobrar, es como el aparato de los locales de Mercado Pago

    Boolean isOk = merchantProcessor.validate(creditCard, totalPrice);
    if (!isOk) {
      throw new RuntimeException("Invalid credit card");
    }
    Boolean isPaymentOk = merchantProcessor.charge(creditCard, totalPrice);
    if (isPaymentOk) {
      return new Invoice(totalPrice);
    } else {
      throw new RuntimeException("Payment rejected");
    }
  }
}
