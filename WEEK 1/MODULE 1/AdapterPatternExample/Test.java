class Test
{
    public static void main(String[] args) {
        PaymentProcessor payment=new PayPalAdapter();
        payment.processPayment();
    }
}