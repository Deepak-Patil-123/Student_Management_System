package com.practise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AddSubSpecifiedDate {

	public static void main(String[] args) throws ParseException {

		String sp="22-mar-2022";
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		
		Calendar cal=Calendar.getInstance();
		
		cal.setTime(sdf.parse(sp));
		cal.add(Calendar.DAY_OF_MONTH, 2);
		String ASSD = sdf.format(cal.getTime());
		System.out.println(ASSD);
	}

}
