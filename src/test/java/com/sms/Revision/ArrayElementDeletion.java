package com.sms.Revision;

public class ArrayElementDeletion {

	public static void main(String[] args) {

		
		int a[]= {12,33,44,66,90};
		
		int c[]=new int[a.length-1];
		
		int in=2;
		
		for(int i=0; i<c.length; i++)
		{
			if(i<in)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=a[i+1];
			}
		}
		
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	
	}

}
