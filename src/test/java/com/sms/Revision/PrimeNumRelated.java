package com.sms.Revision;

public class PrimeNumRelated {

	public static void main(String[] args) {

		int count=0;
		int sum=0;
		for(int i=11; i<=30; i++)
		{
			boolean b=isPrimeNum(i);
			if(b==true)
			{
				count++;
				sum=sum+i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("total prime num in given range :"+count);
		System.out.println("the sum of prime numbers within the given range is :"+sum);		
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
