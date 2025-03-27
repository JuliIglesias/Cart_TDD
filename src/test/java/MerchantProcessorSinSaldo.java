public class MerchantProcessorSinSaldo implements IMerchantProcessor {
  @Override
  public Boolean validate(CreditCard creditCard, int totalPrice) {
    return false;
  }

  @Override
  public Boolean charge(CreditCard creditCard, int totalPrice) {
    return false;
  }
}
