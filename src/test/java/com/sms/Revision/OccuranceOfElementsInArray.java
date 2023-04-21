package com.sms.Revision;

public class OccuranceOfElementsInArray {

	public static void main(String[] args) {

		int a[]= {0,22,44,44,26,55,16,26,0};
		
		
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			
			int A=a[i];
			
			for(int j=0; j<a.length; j++)
			{
				int B=a[j];
				
				if(A==B && i>j)
				{
					break;
				}
				
				else if(A==B)
				{
					count++;
				}
				
			}
			
			if(count>0)
			{
				System.out.println(A+" is present for "+count+" times.");
			}
			
			
		}
		

	}

}
