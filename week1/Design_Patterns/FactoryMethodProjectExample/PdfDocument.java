//package week1.Design_Patterns.FactoryMethodProjectExample;

public class PdfDocument implements Document{
    @Override
    public void open(){
        System.out.print("opening the pdf document");
    }
}
