package com.sms.practise;

public class FirstMaxNumberInArrayWithoutBsort {

	public static void main(String[] args) {

		int a[]= { 7, 2, 0, 1, 5};
		
		int Fmax=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(Fmax < a[i])
			{
				Fmax=a[i];
			}
		}
		
		System.out.println("The first maximum number is :"+Fmax);
	}

}
