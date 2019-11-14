package com.atmecs.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestClass
{
	public static void main(String[] args)
	{
		/*
		 * List<Integer> elements = new ArrayList<>(); elements.add(10); int firstElmnt
		 * = elements.get(0); System.out.println(firstElmnt);
		 * 
		 * // int cardVal = 14; int cardVal = 18; switch (cardVal) { case 4: case 5:
		 * case 6: case 7: case 8: System.out.println("Hit"); break; case 9: case 10:
		 * case 11: System.out.println("Double"); break; case 15: case 16:
		 * System.out.println("Surrender"); break; default: System.out.println("Stand");
		 * }
		 */
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
		
	}

}
