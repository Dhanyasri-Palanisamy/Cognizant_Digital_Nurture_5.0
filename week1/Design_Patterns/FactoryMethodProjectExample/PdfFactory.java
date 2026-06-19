//package week1.Design_Patterns.FactoryMethodProjectExample;

public class PdfFactory extends DocumentFactory {
    
    public Document createDocument(){
        return new PdfDocument();
    }
    
}
