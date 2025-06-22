package FactoryMethod;

public class PdfDoc implements Document {
    @Override
    public void open() {
        System.out.println("PDF file opened.");
    }
}
