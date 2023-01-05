package com.yash.collector;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
public class SortingProductListWithPrice {
 
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
 
 
        
        System.out.println("Original Product list as per insertion-order :- \n");
        products.forEach(System.out::println); 
 
 
 
        
        System.out.println("\nIncreasing price - Sorted Product list :- \n");
 
        
        Comparator<Product> priceComparatorAsc = Comparator
                .comparing(Product::getPrice); 
 
 
        products 
        .stream() 
        .sorted(priceComparatorAsc) 
        .forEach(System.out::println); 
 
 
 
        
        System.out.println("\nDecreasing price - Sorted Product list :- \n");
 
 
        Comparator<Product> priceComparatorDesc = Comparator
                .comparing(Product::getPrice)
                .reversed(); 
 
 
        products 
        .stream() 
        .sorted(priceComparatorDesc) 
        .forEach(System.out::println); 
    }
}