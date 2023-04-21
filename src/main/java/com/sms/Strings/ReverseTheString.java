package com.sms.Strings;

public class ReverseTheString {

	public static void main(String[] args) {

		String s="Bangalore";
		
		//1st way
		String rev="";
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			
			rev=ch+rev;
		}
		
		System.out.println(rev);
		
		//2nd way
		
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
		//3rd way
		
		System.out.println();
		StringBuffer k=new StringBuffer(s);
		StringBuffer n = k.reverse();
		System.out.println(n);
		
	}

}
