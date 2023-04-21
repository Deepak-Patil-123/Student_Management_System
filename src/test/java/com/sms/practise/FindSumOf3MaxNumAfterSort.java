package com.sms.practise;

public class FindSumOf3MaxNumAfterSort {

	public static void main(String[] args) {

     int a[]= {7, 2, 0, 1, 5};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			
		System.out.println("printing the array elements in descending order after sorting!");
			for(int i=0; i<a.length; i++)
				{
			System.out.println(a[i]+" ");
				}
			
			int sum=0;
			for(int i=0; i<3; i++)
			{
				sum=sum+a[i];
			}
			System.out.println("The sum of first 3 maximum numbers is :"+sum);
	}

}
