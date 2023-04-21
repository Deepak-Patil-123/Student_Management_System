package com.sms.Revision;

public class ArrayEleAddition {

	public static void main(String[] args) {

		int a[]= {10,40,60,70,100};
		
		
		int c[]=new int[a.length+1];
		
		int in=2;
		c[in]=22;
		
		for(int i=0; i<a.length; i++)
		{
			if(i<in)
			{
				c[i]=a[i];
			}
			else
			{
				c[i+1]=a[i];
			}
		}
		
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
				
	}

}
