package com.sms.Revision;

public class PerfectNumRangeSum {

	public static void main(String[] args) {

		int n=28;
		int sum=0;
		
		for(int i=1; i<=28; i++)
		{
			boolean b=isPerfectNum(i);
			
			if(b==true)
			{
				sum=sum+i;
				System.out.println(i);
			}
		}
		
		System.out.println("the sum of perfect number withing range is :"+sum);	
	}
		public static boolean isPerfectNum(int n)
		{
			int sum=0;
			int temp=n;
			
			for(int i=1; i<n; i++)
			{
				if(n%i==0)
					sum=sum+i;
			}
			if(sum==temp)
				return true;
			else
				return false;
		}
}
