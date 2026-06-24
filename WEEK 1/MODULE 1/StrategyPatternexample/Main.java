public class Main {
    public static void main(String[] args) {
        PaymentContext context=new PaymentContext(new CreditPayment("1234567890123456"));
        context.executePayment(1999.00);
        context.setStrategy(new PayPalPayment("user@gmail.com"));
        context.executePayment(4599.00);
    }
}