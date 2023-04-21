package com.sms.practise;

public class Find1stMaximumElemntOfAnArrayBsort {

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
		
		System.out.println("the first maximum number after sorting at index 0 is :"+a[0]);
		System.out.println("the last maximum number after sorting  at last index is :"+a[a.length-1]);

	}

}
