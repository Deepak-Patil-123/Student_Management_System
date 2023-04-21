package com.sms.Revision;

public class NTHMaximumElementInArray {

	public static void main(String[] args) {

		
		int a[]= {2,5,3,7,0,12,62,11};
		 
	int big=1;
		for(int i=0; i<a.length; i++)
		{
			int count=1;
			
			for(int j=0; j<a.length; j++)
			{
				
				if(a[i]>a[j])
				{
					count++;
				}
			}
			if(count==big)
			{
				System.out.println(" nth biggest num :"+a[i]);
				break;
			}
			
		}
	
	
	}

}
