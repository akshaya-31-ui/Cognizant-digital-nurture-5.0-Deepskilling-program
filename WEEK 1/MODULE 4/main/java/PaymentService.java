public class PaymentService
{
    private PaymentApi payapi;
    public PaymentService(PaymentApi payapi)
    {
        this.payapi=payapi;
    }
    public boolean makePayment(String cardnumber,double amount)
    {
        return payapi.processPayment(cardnumber,amount);
    }
}