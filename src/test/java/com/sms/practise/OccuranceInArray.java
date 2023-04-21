package com.sms.practise;

import java.util.LinkedHashSet;

public class OccuranceInArray {

	public static void main(String[] args) {

		int a[]= {2,4,4,6,5,6};
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		
		for(Integer n:set)
		{
			int count=0;
			
			for(int i=0; i<a.length; i++)
			{
				if(n==a[i])
				{
					count++;
				}
			}
			System.out.println(n+" occurance of this digit is "+count);
		}
		
	}

}
