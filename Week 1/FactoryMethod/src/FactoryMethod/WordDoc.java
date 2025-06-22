package FactoryMethod;

public class WordDoc implements Document {
    @Override
    public void open() {
        System.out.println("Word file opened.");
    }
}
