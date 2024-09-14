package app;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 1200.0),
                new Product("Coffee Maker", "Appliances", 80.0),
                new Product("Headphones", "Electronics", 150.0),
                new Product("Blender", "Appliances", 50.0)
        );

        Map<String, String> resultProducts = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(Product::getName,
                        Collectors.joining(", ", "{","}"))));

        Map<String, Double> result = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.averagingDouble(Product::getPrice)));

        String maxVal = result.entrySet().stream().max(Map.Entry.comparingByValue()).
                map(Map.Entry::getKey).orElse("No categories");



        System.out.println("Групування продуктів за категоріями: " + resultProducts);
        System.out.println("Середня ціну продуктів в кожній категорії: " + result);
        System.out.println("Категорія з найвищою середньою ціною: " + maxVal);

    }
}
