package com.sms.Revision;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class P {

	public static void main(String[] args) {

		String s="mesh !|_&$ Dee143 pak";  

		int sum=0;
		int tsum=0;
		
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='0' && ch<='9')
			{
				int n=ch-48;
				tsum=10*tsum+n;
			}
			
			else
			{
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum;
		System.out.println("the sum of numbers in string is :"+sum);
	}
}







