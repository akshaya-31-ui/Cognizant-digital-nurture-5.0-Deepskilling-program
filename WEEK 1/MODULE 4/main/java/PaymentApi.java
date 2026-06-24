public interface PaymentApi
{
    boolean processPayment(String cardnumber,double amount);
}