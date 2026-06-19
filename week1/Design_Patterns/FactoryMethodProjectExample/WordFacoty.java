//package week1.Design_Patterns.FactoryMethodProjectExample;

public class WordFacoty extends DocumentFactory {
     public Document createDocument(){
          return new WordDocuments();
     }
}
