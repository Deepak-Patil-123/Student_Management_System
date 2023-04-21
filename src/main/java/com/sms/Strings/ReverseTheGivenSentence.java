package com.sms.Strings;

public class ReverseTheGivenSentence {

	public static void main(String[] args) {

		
		String s="I am from bangalore!";				
		String[] st= s.split(" ");
		
		String rev="";
		for(int i=0; i<st.length; i++)
		{
			String k=" ";
			for(int j=0; j<st[i].length(); j++)
			{
				char ch=st[i].charAt(j);
				k=ch+k;	
			}
			rev=rev+k;
		}
		System.out.println(rev);
		
		String[] st1 = rev.split(" ");
		
		for(int i=0; i<st1.length; i++)
		{
			System.out.print(st1[i]);
		}
	}

}
