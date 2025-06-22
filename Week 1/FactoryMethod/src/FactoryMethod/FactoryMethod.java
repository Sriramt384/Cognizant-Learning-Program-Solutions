package FactoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {
        DocFactory factory;

        factory = new WordFactory();
        Document doc1 = factory.produce();
        doc1.open();

        factory = new PdfFactory();
        Document doc2 = factory.produce();
        doc2.open();

        factory = new ExcelFactory();
        Document doc3 = factory.produce();
        doc3.open();
    }
}
