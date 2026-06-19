//package week1.Design_Patterns.FactoryMethodProjectExample;

public class ExcelFactory extends DocumentFactory {
     
    public  Document CreateDocument(){
        return new ExcelDocument();
    }
}
