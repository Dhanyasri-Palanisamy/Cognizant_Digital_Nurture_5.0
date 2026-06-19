//package week1.Design_Patterns.SingletonPatternExample;

public class Main {
    public static void main(String agrs[]){
        logger logger1= logger.getInstance();
        logger logger2= logger.getInstance();

        logger1.log("hi");
        logger2.log("hello");
        
        System.out.println("both have same instance logger1==logger2 :");
        System.out.print(logger1==logger2);

    }
}
