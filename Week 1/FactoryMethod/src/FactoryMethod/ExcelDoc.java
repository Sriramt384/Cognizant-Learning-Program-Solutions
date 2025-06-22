package FactoryMethod;

public class ExcelDoc implements Document {
    @Override
    public void open() {
        System.out.println("Excel file opened.");
    }
}
