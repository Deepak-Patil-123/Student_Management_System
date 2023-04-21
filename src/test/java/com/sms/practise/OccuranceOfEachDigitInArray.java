package com.sms.practise;

public class OccuranceOfEachDigitInArray {

	public static void main(String[] args) {

		int ar[]= {2,4,4,6,5,6};
		
		for(int i=0; i<ar.length; i++)
		{
			int count=0;
			int a=ar[i];
			
			for(int j=0; j<ar.length-1; j++)
			{
				int b=ar[j];
				
				if(a==b && i>j)
				{
					break;
				}
				
				if(a==b)
				{
					count++;
				}
					
			}
			
			if(count>0)
				
			{
				System.out.println(a+" Present"+count+" times");
			}
			
		}
		
	}

}
