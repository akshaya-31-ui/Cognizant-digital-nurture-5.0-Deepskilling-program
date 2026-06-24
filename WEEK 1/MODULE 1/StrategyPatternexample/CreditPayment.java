public class CreditPayment implements PaymentStrategy 
{
    private String cardNumber;
    public CreditPayment(String cardNumber) 
    {
        this.cardNumber=cardNumber;
    }
    public void pay(double amount) 
    {
        System.out.println("Paid Rs." + amount + " using Credit Card ending with "
                + cardNumber.substring(cardNumber.length() - 4));
    }
}