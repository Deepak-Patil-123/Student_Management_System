package com.sms.Strings;

public class SumOfDigitsInString {

	public static void main(String[] args) {

		String s="a2b4f6";
		
		int sum=0;
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='0' && ch<='9')
			{
				sum=sum+(ch-48);
			}
		}
		
		System.out.println("sum of numbers in string is :"+sum);
	}

}
