package com.sms.Strings;

public class OccuranceOfEachWords {

	public static void main(String[] args) {

		String s="I am am from bangalore bangalore";
		
		String []str=s.split(" ");
		
		
		for(int i=0; i<str.length; i++)
		{
			String A=str[i];
			
			int count=0;
			
			for(int j=0; j<str.length; j++)
			{
				String B=str[j];
				
				if(A.equals(B) && i>j)
				{
					break;
				}
				
				else if(A.equals(B))
				{
					count++;
				}
			}
			
			if(count==1)
			{
				System.out.println(A+" is Occured for "+count+" times!");
			}
		}
	}

}
