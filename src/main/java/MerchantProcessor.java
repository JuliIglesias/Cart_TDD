public class MerchantProcessor implements IMerchantProcessor {
  @Override
  public Boolean validate(CreditCard creditCard, int totalPrice) {
    return true;
  }

  @Override
  public Boolean charge(CreditCard creditCard, int totalPrice) {
    return true;
  }
}
