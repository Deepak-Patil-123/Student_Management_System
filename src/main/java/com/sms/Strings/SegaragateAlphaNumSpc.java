package com.sms.Strings;

public class SegaragateAlphaNumSpc {

	public static void main(String[] args) {

		String s="a2b&D3e*"; //op: abDe 23 &*
		
		String alpha="";
		String num="";
		String spc="";
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				alpha=alpha+ch;
			}
			
			else if(ch>='0' && ch<='9')
			{
				num=num+ch;
			}
			
			else
			{
				spc=spc+ch;
			}
		}
		
		System.out.println(alpha+" "+num+" "+spc);
	}

}
