package com.sms.Revision;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {

	
	int n=1538;
	int count=0;
	while(n!=0)
	{
		int r=n%10;
		boolean b=isPrimeNum(r);
		{
			if(b==true)
				count++;
		}
		n=n/10;
	}
	
	System.out.println("total number of prime digits presnt in number are :"+count);
	}
	
	public static boolean isPrimeNum(int n)
	{
		
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
