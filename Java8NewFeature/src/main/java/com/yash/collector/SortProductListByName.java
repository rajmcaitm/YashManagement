package com.yash.collector;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
public class SortProductListByName {
 
    // List of Products
    private static List<Product> getProductList() {
 
        return Arrays.asList(
                new Product(101, "Wheat", 1089L, 36.89),
                new Product(102, "Rice", 502L, 58.19),
                new Product(103, "Lentils", 803L, 102.45),
                new Product(104, "Oil", 208L, 164.75),
                new Product(105, "Vegetables", 303L, 45.50)
                );
    }
 
    public static void main(String[] args) {
 
       
        List<Product> products = getProductList();
 
 
        
        System.out.println("Product list as per Insertion-order :-\n");
        products.forEach(System.out::println); 
 
 
        
        System.out.println("\n\nSorted Product list by alphabetical order of Name :-\n");
 
 
      products
      .stream()
      .sorted(Comparator.comparing(Product::getName))
      .forEach(System.out::println);
      
    }
}