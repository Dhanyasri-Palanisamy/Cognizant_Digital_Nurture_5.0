

public class PremiumDiscount implements DiscountCalculator{
    @Override
   public double  calculateDiscount(double amt){
    return amt*0.2;
   }
}
