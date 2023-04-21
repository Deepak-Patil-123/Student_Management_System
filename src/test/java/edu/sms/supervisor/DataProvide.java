package edu.sms.supervisor;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide {

	@DataProvider
	public String[] data()
	{
		String []ar=new String[4];
		
		ar[0]="deepak";
		ar[1]="Ty";
		ar[2]="QSP";
		ar[3]="TCS";
				
		return ar;
	}
	
	@Test(dataProvider="data")
	public void test1(String ar)
	{
		System.out.println(ar);
	}
}
