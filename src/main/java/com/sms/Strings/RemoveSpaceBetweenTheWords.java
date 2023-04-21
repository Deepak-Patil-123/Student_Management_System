package com.sms.Strings;

public class RemoveSpaceBetweenTheWords {

	public static void main(String[] args) {

		String s="I am From bangalore!";
		
		//1st approach
		
		System.out.println(s.replace(" ", ""));
		
		// 2nd approach
		
		String st[]=s.split(" ");
		
		for(int i=0; i<st.length; i++)
		{
			System.out.print(st[i]);
		}
	}

}
