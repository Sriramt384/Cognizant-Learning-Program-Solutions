package FactoryMethod;

public class ExcelFactory extends DocFactory {
    @Override
    public Document produce() {
        return new ExcelDoc();
    }
}
