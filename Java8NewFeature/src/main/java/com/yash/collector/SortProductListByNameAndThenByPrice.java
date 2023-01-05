package com.yash.collector;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
public class SortProductListByNameAndThenByPrice {
 
    
    private static List<Product> getProductList() {
 
        return Arrays.asList(
                new Product(101, "Wheat", 1089L, 36.89),
                new Product(102, "Wheat", 502L, 58.19),
                new Product(103, "Lentils", 803L, 102.45),
                new Product(104, "Oil", 208L, 164.75),
                new Product(105, "Oil", 303L, 45.50)
                );
    }
 
    public static void main(String[] args) {
 
        
        List<Product> products = getProductList();
 
 
        
        System.out.println("Original Product list as per Insertion-order :-\n");
        products.forEach(System.out::println); 
 
 
 
        //Sort Product list first by Name & then by Price
        System.out.println("\n\nSort Product list first by Name & then by Price :-\n");
 
 
        
        products
        .stream()
        .sorted(
                Comparator.comparing(Product::getName) // 1. name sorting
                .thenComparing(Product::getPrice) // 2. price sorting
                )
        .forEach(product -> System.out.println(
                "Product [name=" + product.getName() 
                + ", price=" + product.getPrice()
                + ", id=" + product.getId()
                + ", quantity=" + product.getQuantity()
                + "]"
                )); 
    }
}