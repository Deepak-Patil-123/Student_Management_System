package com.sms.Assignment;

public class TestYantraOccuranceDuplicatePosition {

	public static void main(String[] args) {

		String s="TestYantra";
		
		int count1[]=new int[26];
		
		int count2[]=new int[26];
		
		for(int i=0; i<s.length(); i++)
		{
			
			char ch = s.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{
				count1[ch-65]++;
			}
			
			else if(ch>='a' && ch<='z')
			{
				count2[ch-97]++;
			}
		}
		
		System.out.println("printing the occurance of charecters in the given string.");
		for(int i=0; i<26; i++)
		{
			if(count1[i]>0)
			{
				System.out.println((char)(i+65)+" is present for "+count1[i]);
			}
			
		}
		
		for(int i=0; i<26; i++)
		{
			if(count2[i]>0)
			{
				System.out.println((char)(i+97)+" is present for "+count2[i]);
			}
			
		}
		
		System.out.println("printing the duplicates charecter from the given string is given below.");
		
		for(int i=0; i<26; i++)
		{
			if(count1[i]>0)
			{
				System.out.println((char)(i+65)+" is duplicate for "+count1[i]);
			}
			
		}

		for(int i=0; i<26; i++)
		{
			if(count2[i]>0)
			{
				System.out.println((char)(i+97)+" is duplicate for "+count2[i]);
			}
			
		}
		
		
		


	}

}
