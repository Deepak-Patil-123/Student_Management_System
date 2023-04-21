package com.sms.Strings;

public class PositionWithoutDuplicates {

	public static void main(String[] args) {

		
		String s="Tester";
		s=s.toLowerCase();
		
		boolean b[]=new boolean[s.length()];
		
		int count=0;
		
		for(int i=0; i<s.length(); i++)
		{
			
			int occ=1;
			
			if(b[i]==false)
			{
				for(int j=i+1; j<s.length(); j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						occ++;
						count++;
						b[j]=true;
					}
				}
				
				System.out.println(s.charAt(i)+" is occured for "+occ+" times where in position is "+(i+1));
			}
			
			
		}
		System.out.println("No of duplicates are present is :"+count);
	}

}
