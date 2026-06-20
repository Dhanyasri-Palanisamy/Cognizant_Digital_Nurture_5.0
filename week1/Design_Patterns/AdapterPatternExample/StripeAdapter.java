public class StripeAdapter implements PaymentProcessor{

    private Stripe stripe;

    public StripeAdapter(){
        stripe = new Stripe();
    }

    @Override
    public void processPayment(){
        stripe.makePayment();
    }

}