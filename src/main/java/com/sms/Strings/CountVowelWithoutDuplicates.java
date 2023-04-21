package com.sms.Strings;

import java.util.LinkedHashSet;

public class CountVowelWithoutDuplicates {

	public static void main(String[] args) {

		String s="India";
		s=s.toLowerCase();
		
		int count[]=new int[26];
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
			{
				set.add(count[ch-97]++);
			}
		}
		
		int VC=0;
		
		for(int i=0; i<26; i++)
		{
			if(count[i]!=0)
			{
				VC++;
			}
		}
		
		System.out.println("No of vowels without duplicates :"+VC);
		
	}

}
