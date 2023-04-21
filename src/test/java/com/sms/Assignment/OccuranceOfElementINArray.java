package com.sms.Assignment;

public class OccuranceOfElementINArray {

	public static void main(String[] args) {

		int a[]= { 6,1,1,4,5,5,2};
		
		for(int i=0; i<a.length; i++)
		{
			int A=a[i];
			
			int count=0;
			
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
			System.out.println(A+" this element is occured for "+count+" times.");
			}
		}
	}

}
