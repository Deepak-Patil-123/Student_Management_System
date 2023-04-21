package com.practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practise {

/*	@DataProvider
	public Iterator<String> data()
	{
		List<String> list=new ArrayList<>();
		
		list.add("Deepak");
		list.add("Shahaji");
		list.add("Aishwarya");
		
		return list.iterator();
	}
*/
	
	@DataProvider
	public String[][] data()
	{
		String arr[][]=new String[2][2];
		
		arr[0][0]="Deepak";
		arr[0][1]="Patil";
		arr[1][0]="test";
		arr[1][1]="engineer";
			return arr;
	}
	@Test(dataProvider="data")
	public void test1(String arr[])
	{
		System.out.println(arr);
	}
}
