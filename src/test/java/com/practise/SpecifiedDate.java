package com.practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SpecifiedDate {

	public static void main(String[] args) throws ParseException {

		String s="2023-20-03";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-dd-MM");
		Calendar cal=Calendar.getInstance(); 
		cal.setTime(sdf.parse(s));
		  String specifiedDate = sdf.format(cal.getTime());
		System.out.println(specifiedDate);
	}

}
