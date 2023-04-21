package com.sms.Assignment;

import java.util.LinkedHashSet;

public class TestYantra2OccuranceDuplicatesPosition {

	public static void main(String[] args) {

		String s="I am am from i Testyantra";
		
		String arr[]=s.toLowerCase().split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<>();
		
		for(int i=0; i<arr.length; i++)
		{
			set.add(arr[i]);
		}
		
		for(String data:set)
		{
			int count=0;
			
			for(int i=0; i<arr.length; i++)
			{
				if(data.equals(arr[i]))
				{
					count++;
				}
			}
			System.out.println(data+" is present for "+count+" times");
		}
		
	}

}
