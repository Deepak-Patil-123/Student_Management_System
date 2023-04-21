package com.sms.Strings;

public class PrintMinimumLengthOfWordsInString {

	public static void main(String[] args) {

		
		String[] s={"ab","abc","abcd","dfgh","ed"};
		
	
		String min_length=s[0];
		
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()<min_length.length())
			{
				min_length=s[i];	 
			}
		}
		
		for(int i=0; i<s.length; i++)
		{
			if(s[i].length()==min_length.length())
			{
				System.out.println(s[i]);
				int count=s[i].length();
				System.out.println(count);
			}
		}
		//System.out.println(" the minimum length of word in given string is :"+min_length);

	}

}
