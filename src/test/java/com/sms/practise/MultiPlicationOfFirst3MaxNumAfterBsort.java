package com.sms.practise;

public class MultiPlicationOfFirst3MaxNumAfterBsort {

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
		
			int product=1;
			
			for(int i=0; i<3; i++) {
				product=product*a[i];
			}
			
			System.out.println("The product of first 3 maximum numbers is :"+product);

	}

}
