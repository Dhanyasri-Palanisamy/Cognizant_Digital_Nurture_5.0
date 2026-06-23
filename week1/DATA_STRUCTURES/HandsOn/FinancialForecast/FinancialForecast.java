public class FinancialForecast {

    static double forecast(double currentValue,double growthRate,int years){

        if(years==0)
            return currentValue;

        return forecast(currentValue*(1+growthRate),growthRate,years-1);

    }

    public static void main(String[] args){

        double current=1000;

        double growth=0.10;

        int years=5;

        double future=forecast(current,growth,years);

        System.out.println("Future Value = "+future);

    }

}