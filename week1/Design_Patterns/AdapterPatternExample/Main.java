//package week1.Design_Patterns.AdapterPatternExample;

public class Main {
    public static void main(String args[]){
        PaymentProcessor payment= new StripeAdapter();
        payment.processPayment();
    }
}
