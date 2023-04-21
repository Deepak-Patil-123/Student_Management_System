package com.practise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddSubstractCurrentDate {

	public static void main(String[] args) {

		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		Calendar cal=Calendar.getInstance();
		
		cal.add(Calendar.DAY_OF_MONTH,-2);
		
		String ASCD = sdf.format(cal.getTime());
		
		System.out.println(ASCD);
	}

}
