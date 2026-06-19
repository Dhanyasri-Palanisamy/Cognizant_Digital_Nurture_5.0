//package week1.Design_Patterns.FactoryMethodProjectExample;

public abstract class DocumentFactory {
     public void log() {
        System.out.println("Creating document...");
    }
    public abstract Document CreateDocument();
}
