package com.atmecs.java8.streams.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilteringCollection
{
	private static List<Product> prodList = new ArrayList<>();
	public static void main(String[] args)
	{
		prodList.add(new Product(123, "acer", 25000.56d));
		prodList.add(new Product(456, "hp", 35000.56d));
		prodList.add(new Product(189, "mac", 95000.56d));
		prodList.add(new Product(111, "dell", 75000.56d));
		prodList.add(new Product(112, "asus", 75000.56d));
		
		withStreamApi();
		
	}
	private static void withStreamApi()
	{
		//filtering data where product price >26000
		 prodList.stream()
				 .filter(prod -> prod.getProdPrice() > 26000)
				 .map((prod)-> prod.getProdPrice())
				 .collect(Collectors.toList())
		 		 .forEach((price)->System.out.println(price));
		 
		//Summing the product price
		 double totalPrice = prodList.stream()
		 		 .collect(Collectors.summingDouble(prod-> prod.getProdPrice()));
		 System.out.println("Total Price : " + totalPrice);
		 
		 //Finding Min and Max Product Price
		 
		 Product prod1 = prodList.stream()
				 		 .max((p1,p2)->p1.getProdPrice() > p2.getProdPrice() ? 1 :-1).get();
		 System.out.println("Max Product Price: " + prod1.getProdPrice());
		 
		 Product prod2 = prodList.stream()
				 		 .max((p1,p2)-> p1.getProdPrice() < p2.getProdPrice() ? 1 : -1).get();
		 System.out.println("Min Prod Price: " + prod2.getProdPrice());
		 
		 //Using comparator  to find min and max product name	
		 Comparator<Product> nameComparator = Comparator.comparing(Product :: getProdName);
		 
		 Product minObj = prodList.stream().min(nameComparator).get();
		 Product maxObj = prodList.stream().max(nameComparator).get();
		 
		 System.out.println("Min Product Name: " + minObj.getProdName());
		 System.out.println("Max Product Name: " + maxObj.getProdName());
		 
		 //Using comparator  to find min and max product name	
		 Comparator<Product> priceComparator = Comparator.comparing(Product :: getProdPrice);
		 
		 Product minProdNameObj = prodList.stream().min(priceComparator).get();
		 Product maxProdNameObj = prodList.stream().max(priceComparator).get();
		 
		 System.out.println("Min Product Price: " + minProdNameObj.getProdPrice());
		 System.out.println("Max Product Price: " + maxProdNameObj.getProdPrice());
		 
		 //Converting List to Set in Streams
		 Set<Double> prodSet = prodList.stream()
				 						.filter(prod -> prod.getProdPrice() >25000)
				 						.map(prod-> prod.getProdPrice())
				 						.collect(Collectors.toSet());
		 prodSet.forEach(price->System.out.println("Product Unique Prices: "+ price));
		 
		 //forEachOrder() for Parallel Stream forEachOrder() will ensure the order in parallel stream processing
		  prodList.parallelStream()
				  .filter(f->f.getProdName().startsWith("a"))
				  .map(f-> f.getProdName()).forEachOrdered(System.out :: println);
		 
	}
	
}
