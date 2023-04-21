package com.sms.practise;

public class Append0sAtFirst {

	public static void main(String[] args) {

		int a[]= {0,1,0,0,1};
		
		int k=0;
		int n=a.length-1;
		
		int b[]=new int[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
			{
				b[i]=a[i];
				k++;
			}
			else
			{
				b[n]=a[i];
				n--;
			}
		}
		
		for(int j=0; j<b.length; j++)
		{
			System.out.print(b[j]+" ");
		}
	}

}
