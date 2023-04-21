package com.sms.practise;

public class Find1stMinNumberWithoutBSort {

	public static void main(String[] args) {

		
		int a[]= { 7, 2,0, 1, 5};
		
		int Fmin=a[0];   //7
		
		for(int i=0; i<a.length; i++)
		{
			if(Fmin>a[i])    //a[i]=7
			{
				Fmin=a[i];  
			}
		}
		
		System.out.println("the first min number is :"+Fmin);
	}

}
