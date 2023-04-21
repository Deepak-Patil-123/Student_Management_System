package com.sms.Revision;
import java.util.Scanner;
public class MergeTwoArray {

	public static void main(String[] args) {

		
		int a[]= {11,22,33,44,55,66};
		
		int b[]= {11,22,33,44,55,66};
		
		
		int c[]=new int [a.length+b.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<a.length && j<b.length)
		{
			c[k++]=a[i++];
			c[k++]=b[j++];
		}
		
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		
		while(j<b.length)
		{
			c[k++]=b[j++];
		}

		for(int n=0; n<c.length; n++)
		{
			System.out.print(c[n]+" ");
		}
	}

}
