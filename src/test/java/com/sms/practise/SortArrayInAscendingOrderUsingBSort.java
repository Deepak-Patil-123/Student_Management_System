package com.sms.practise;

public class SortArrayInAscendingOrderUsingBSort {

	public static void main(String[] args) {

		int a[]= {7,2,0,1,5};
		
		for(int i=0; i<a.length; i++)           //7,2,0,1,5
		{                                       //2,7,0,1,5
			for(int j=i+1; j<a.length; j++)     //2,0,7,1,5
			{                                   //0,2,7,1,5
												//0,2,1,7,5
				if(a[i]>a[j])                   //0,1,2,7,5
				{                              	//0,1,2,5,7
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;		
			    }
				
		    }
			System.out.println(a[i]);
	    }
		
	}
}

