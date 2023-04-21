package com.sms.Strings;

import java.util.Scanner;

public class CountUpperAndLowerCase {

	public static void main(String[] args) {

		
	/*	System.out.println("enter the string!");
		Scanner sc=new Scanner(System.in);
		String k = sc.nextLine();
		
		
		int upper=0;
		int lower=0;
		
		for(int i=0; i<k.length(); i++)
		{
			char ch=k.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{	
				upper++;
			}
			
			else if(ch>='a' && ch<='z')
			{
				lower++;
			}
		}
		
		System.out.println("no of uppercases are present in given string is :"+upper);
		System.out.println("no of lowercases are present in given string is :"+lower);
		
	*/	
		System.out.println("enter the string!");
		Scanner sc1=new Scanner(System.in);
		String k1 = sc1.nextLine();
		
		

		int count1[]=new int[26];
		int count2[]=new int[26];
		
		for(int i=0; i<k1.length(); i++)
		{
			char ch=k1.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{	
				count1[ch-65]++;
			}
			
			else if(ch>='a' && ch<='z')
			{
				count2[ch-97]++;
			}
		}
		
		for(int i=0; i<26; i++)
		{
			if(count1[i]!=0)
			{
				System.out.println((char)(i+65)+" is present for "+count1[i]);
			}
		}
		
		for(int i=0; i<26; i++)
		{
			if(count2[i]!=0)
			{
				System.out.println((char)(i+97)+" is present for "+count2[i]);
			}
		}
		
		
		
		
		
		
	}

}
