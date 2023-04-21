package com.sms.practise;

public class Find1StAnd2ndMinNumberFromArrayWithoutUsingBSORT2 {

	public static void main(String[] args) {

		
		int a[]= {0,7,2,5,1,0};
		
		int Fmin=a[0];
		int Smin=a[0];
		
		for(int i=0; i<a.length; i++)
		{
			// i=0  0<5  a[i]=0
			// i=1  1<5  a[i]=7
			// i=2  2<5  a[i]=2
			// i=3  3<5  a[i]=1
			// i=4  4<5  a[i]=5
			if(a[i]<=Fmin)
			{
				if(a[i]!=Fmin)
				{
					Smin=Fmin;
				}
				Fmin=a[i];
			}	
				else if(Fmin==Smin || a[i]<Smin)
				{
					Smin=a[i];
				}
			}
		
		System.out.println("the first min number is :"+Fmin);
		System.out.println("the second min number is :"+Smin);
	}

}
