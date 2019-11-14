package com.atmecs.java8.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagrams
{
	private static void printAnagrams(String[] arr)
	{
		Map<String,List<String> > map= new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			String word = arr[i];
			char[] letters = word.toCharArray();
			Arrays.sort(letters);
			String newWord = new String(letters);
			
			if(map.containsKey(newWord))
			{
				map.get(newWord).add(word);
			}
			else
			{
				List<String> words = new ArrayList<String>();
				words.add(word);
				map.put(newWord, words);
			}
			
			for(String s: map.keySet())
			{
				List<String> values = map.get(s);
				if(values.size() > 1)
				{
					System.out.println(values);
				}
			}
			
		}
	}
	
	public static void main(String[] args)
	{
		String arr[] = {"cat","dog","act","god","tac"};
		//Using HashMap
		printAnagrams(arr);
		
	}
}
