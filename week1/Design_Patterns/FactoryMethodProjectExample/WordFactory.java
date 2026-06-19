//package week1.Design_Patterns.FactoryMethodProjectExample;

public class WordFactory extends DocumentFactory {
     @Override
     public Document CreateDocument(){
          return new WordDocument();
     }
}
