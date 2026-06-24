class PayPalAdapter implements PaymentProcessor
{
    private PayPalGateway gateway;
    public PayPalAdapter()
    {
        gateway=new PayPalGateway();
    }
    @Override
    public void processPayment()
    {
        gateway.sendPayment();
    }
}