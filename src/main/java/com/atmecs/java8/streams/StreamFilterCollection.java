package com.atmecs.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;

	public Product(int id, String name, double price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamFilterCollection
{
	public static void main(String[] args)
	{
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "Acer", 20000));
		productsList.add(new Product(1, "Dell", 40000));
		productsList.add(new Product(1, "Mac", 200000));
		productsList.add(new Product(1, "HP", 28000));
		productsList.add(new Product(1, "Asus", 27000));

		// Without Streams
		List<Double> productPriceList = new ArrayList<Double>();
		for (Product product : productsList)
		{

			// filtering data of list
			if (product.price < 30000)
			{
				productPriceList.add(product.price); // adding price to a productPriceList
			}
		}
		System.out.println(productPriceList); // displaying data

		// Using Streams
		List<Double> prodPriceList = productsList.stream()
										.filter(p -> p.price > 30000)
										.map(p -> p.price)
										.collect(Collectors.toList());
		
		System.out.println(prodPriceList);

	}

}