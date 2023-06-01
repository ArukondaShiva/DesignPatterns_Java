public class CreditCardStrategy implements PaymentStrategy{

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String _name,String _cardNumber,String _cvv,String _dateOfExpiry){
        name = _name;
        cardNumber = _cardNumber;
        cvv = _cvv;
        dateOfExpiry = _dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
      System.out.println(amount +" paid with credit/debit card");
    }
    
}
