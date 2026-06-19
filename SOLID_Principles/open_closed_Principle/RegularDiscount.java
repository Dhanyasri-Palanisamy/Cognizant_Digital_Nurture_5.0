

public class RegularDiscount implements DiscountCalculator{
    @Override
   public double calculateDiscount(double amt){
       return amt*0.1;
    }
}
