package ch.elexis.hl7.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HL7Helper {
	private static final String PATTERN = "yyyyMMddHHmmss"; 
	
	public static Date stringToDate(final String dateTimeStr) 
	       throws ParseException {
		
		  if (dateTimeStr == null || dateTimeStr.length() == 0) {
			  return null;
		  }
		  
		  SimpleDateFormat sdf = new SimpleDateFormat(PATTERN.substring(0, dateTimeStr.length()));
		  return sdf.parse(dateTimeStr);
	}	
}

