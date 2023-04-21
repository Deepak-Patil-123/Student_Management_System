package com.sms.Strings;

public class PrintMaximumLengthOfWordInString {

	public static void main(String[] args) {

		String[] s={"ab","abc","abcd","dfgh","ed"};
		
		
		String max_length=s[0];
		
		
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()>max_length.length())
			{
				max_length=s[i];
			}
		}
		
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()==max_length.length())
			{
				System.out.println(s[i]+" --> the length of string is : "+s[i].length());
			
			}
		}
	}

}
