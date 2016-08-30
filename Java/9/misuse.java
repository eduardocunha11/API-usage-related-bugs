package com.google.appengine.droidsensorserver;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyApp {
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		cal.set(Calendar.MONTH, month - 1);
		System.out.println(cal);
	}
}
