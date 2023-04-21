package com.sms.Assignment;

public class SumOfFirst3MinNumberWithoutUsingBsort {

	public static void main(String[] args) {

		
		int a[]= { 6,1,4,5,5,2};
		
		int Fmin=a[0];
		int Smin=a[0];
		int Tmin=a[0];
		
		
		for(int i=0; i<a.length; i++)
		{
			if(Fmin>a[i])
			{
				if(a[i]!=Fmin)
				{
					Smin=Fmin;
					if(Smin>a[i])
					{
						if(a[i]!=Smin)
						{
							Tmin=Smin;
							if(Tmin>a[i])
							{
								Tmin=Smin;
							}
							Tmin=a[i];
						}
					}
					Smin=a[i];
					
				}			
				
				Fmin=a[i];
			}
			
			else if(Fmin==Smin || a[i]<Smin)
			{
				Smin=a[i];
			}
			
			else if(Smin==Tmin || a[i]<Tmin)
			{
				Tmin=a[i];
			}
			
		}
		
		int sum=Fmin+Smin+Tmin;
		System.out.println("the sum of first three min number is :"+sum);
		
		
		
	}

}
