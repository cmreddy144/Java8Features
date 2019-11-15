package com.atmecs.java8.streams.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingStringOccurances
{

	public static void main(String[] args)
	{
		String s = "Jon Ajeet Steve Ajeet Jon Ajeet";
		String delimter = " ";
		charcterOccrance(s,delimter);
	}

	private static void charcterOccrance(String s, String delimter)
	{
		List<String> stringList = Arrays.asList(s.split(delimter));
		Map<String, Long> map = stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		stringList.parallelStream().forEachOrdered( System.out :: println);		
	}

}
