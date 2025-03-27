public interface IMerchantProcessor {
  Boolean validate(CreditCard creditCard, int totalPrice);

  Boolean charge(CreditCard creditCard, int totalPrice);
}
