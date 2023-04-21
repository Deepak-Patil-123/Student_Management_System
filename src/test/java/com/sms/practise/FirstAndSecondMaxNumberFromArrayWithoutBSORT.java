 package com.sms.practise;

public class FirstAndSecondMaxNumberFromArrayWithoutBSORT {

	public static void main(String[] args) {

		
		int a[]= {0,7,2,1,5};
		
		int Fmax=a[0];
		int Smax=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>Fmax) 
			{
				if(a[i]!=Fmax)
				{
					Smax=Fmax;
				}
					
				Fmax=a[i];
			}
			else if(Fmax==Smax || a[i]>Smax)
			{
				Smax=a[i];
			}
		}
		
		System.out.println("the first max number is :"+Fmax);
		System.out.println("the second max number is :"+Smax);
	}

}
