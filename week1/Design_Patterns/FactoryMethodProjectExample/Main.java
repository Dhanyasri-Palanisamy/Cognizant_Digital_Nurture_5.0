public class Main {
    public static void main(String args[]){
        DocumentFactory docfac= new PdfFactory();
        Document  doc= docfac.CreateDocument();
        doc.open();

        docfac= new ExcelFactory();
        doc= docfac.CreateDocument();
        doc.open();

         docfac= new WordFactory();
        doc= docfac.CreateDocument();
        doc.open();
    }
}
