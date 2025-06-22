package FactoryMethod;

public class WordFactory extends DocFactory {
    @Override
    public Document produce() {
        return new WordDoc();
    }
}
