package com.sms.Revision;

public class ArmstrongNum {

	public static void main(String[] args) {

	//	int n=153;
		
		for(int i=1; i<1000; i++)
		{
		 boolean b=isArmStrongNum(i);
		if(b==true)
		{
			System.out.print(i+" ");
		
		}
		
		}
	}
	
	public static boolean isArmStrongNum(int n)
	{
		int temp=n;
		int sum=0;
		
		int dc=countDigits(n);
		
		while(n!=0)
		{
			int r=n%10;
			sum=sum+pow(r,dc);
			n=n/10;
		}
		if(temp==sum)
			return true;
		else
			return false;
	}
	
	public static int countDigits(int n)
	{
		int count=0;
		
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		
		return count;
	}
	
	public static int pow(int r,int dc)
	{
		int pow=1;
		
		while(dc>0)
		{
			pow=pow*r;
			dc--;
		}
		
		return pow;
	}
	
	
}