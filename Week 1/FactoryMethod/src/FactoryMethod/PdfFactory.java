package FactoryMethod;

public class PdfFactory extends DocFactory {
    @Override
    public Document produce() {
        return new PdfDoc();
    }
}
