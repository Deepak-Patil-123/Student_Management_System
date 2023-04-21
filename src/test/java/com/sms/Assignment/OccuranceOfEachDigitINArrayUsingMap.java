package com.sms.Assignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class OccuranceOfEachDigitINArrayUsingMap {

	public static void main(String[] args) {

		int a[]= { 6,1,1,4,5,5,2};
		
		
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
		
		for(int i=0; i<a.length; i++)
		{
			
			int count=0;
			
			for(int j=0; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			map.put(a[i], count);
		}
		
		System.out.println(map);
	}

}
