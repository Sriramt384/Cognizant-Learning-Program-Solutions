package com.ecommerce;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Java", "1995"),
            new Product(102, "C++", "1980"),
            new Product(103, "Python", "1991"),
            new Product(104, "C#", "2000")
        };
        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.productId, p2.productId));
        Product result1 = Search.linearSearch(products, 103);
        System.out.println("Linear Search Found: "+result1);
        Product result2 = Search.binarySearch(products,102);
        System.out.println("Binary Search Found: "+result2);
    }
}

