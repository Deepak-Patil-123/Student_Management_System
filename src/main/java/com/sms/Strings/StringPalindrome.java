package com.sms.Strings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		String s="malayalam";
		
		String rev="";
		
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(rev.equals(s))
		{
			System.out.println("it is palindrome!");
		}
		else
		{
			System.out.println("it is not palindrome!");
		}
		
		System.out.println("enter the string!");
		Scanner sc=new Scanner(System.in);
		String k = sc.nextLine();
		
		boolean b=isPalindrome(k);
		if(b==true)
		{
			System.out.println("it is palindrome!");
		}
		else
		{
			System.out.println("it is not palindrome!");
		}
		
	}
	public static boolean isPalindrome(String k)
	{
		char ch[]=k.toCharArray();
		
		int i=0;
		int j=ch.length-1;
		
		while(i<j)
		{
			if(ch[i]!=ch[j])
			{
				return false;
			
			}
			i++;
			j--;
		}
		return true;
	}

}
