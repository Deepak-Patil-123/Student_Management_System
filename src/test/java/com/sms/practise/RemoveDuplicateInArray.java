package com.sms.practise;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {

		
		int a[]= {2,4,4,6,5,6};
		
		
		HashSet<Integer> set=new LinkedHashSet<>();
		
		for(int i=0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		
		System.out.println(set);
	}

}
