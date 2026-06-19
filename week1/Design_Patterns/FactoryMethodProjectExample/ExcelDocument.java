//package week1.Design_Patterns.FactoryMethodProjectExample;

public class ExcelDocument implements Document {
    @Override
    public void open(){
        System.out.println("");
        System.out.println("opening Excel Document");
    }
}
