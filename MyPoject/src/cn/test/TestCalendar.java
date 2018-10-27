package cn.test;

import java.util.Calendar;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(cal.getTime());
	}
	
}


