//package week1.Design_Patterns.FactoryMethodProjectExample;

public class PdfFactory extends DocumentFactory {
    @Override
    public Document CreateDocument(){
        return new PdfDocument();
    }
    
}
