

public class Main {
    public static void main(String args[]){
        DiscountCalculator pr= new PremiumDiscount();
       double dd= pr.calculateDiscount(25000);
        System.out.print(dd);

        DiscountCalculator tr= new RegularDiscount();
        double td= tr.calculateDiscount(25000);
        System.out.println(td);

    }
}
