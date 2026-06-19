//package week1.Design_Patterns.FactoryMethodProjectExample;

public class PdfDocument implements Document{
    @Override
    public void open(){
        System.out.println("opening the pdf document");
        System.out.println();
    }
}
