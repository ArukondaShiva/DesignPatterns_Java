public class PaypalStrategy implements PaymentStrategy{

    private String emailId;
    private String password;
 
    public PaypalStrategy(String _emailId,String _password){
        emailId = _emailId;
        password = _password;
    }

    @Override
    public void pay(int amount) {
      System.out.println(amount + " paid using Paypal.");   
    }
    
}
