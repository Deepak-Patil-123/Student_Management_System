package com.sms.Revision;

public class HappyNumber {

	public static void main(String[] args) {

		int n=13;
		
		for(int i=0; i<99; i++)
		{
			boolean b=isHappyNum(i);
			if(b==true)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static boolean isHappyNum(int n)
	{
		
		while(n>9)
		{
			int sum=0;
			while(n!=0)
				{
				int r=n%10;
				sum=sum+r*r;
				n=n/10;
			}
			n=sum;
		}
		if(n==1 || n==7)
			return true;
		else
			return false;
	}

}
