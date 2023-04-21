package com.sms.Strings;

import java.util.Scanner;

public class CountNoOfDuplicateInString {

	public static void main(String[] args) {

		
		System.out.println("enter the string!");
		Scanner sc=new Scanner(System.in);
		String k= sc.nextLine();
		String n = k.toLowerCase();
		

		int count[]=new int[26];
		
		
		for(int i=0; i<n.length(); i++)
		{
			char ch=n.charAt(i);
			
			
			if(ch>='a' && ch<='z')
			{
				count[ch-97]++;
			}
		}
		
		for(int i=0; i<26; i++)
		{
			if(count[i]>1)
			{
				System.out.println((char)(i+97)+" is duplicate for "+count[i]+" times!");
			}
		}

	}

}
