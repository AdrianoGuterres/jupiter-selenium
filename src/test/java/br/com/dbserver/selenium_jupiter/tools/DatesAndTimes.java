package br.com.dbserver.selenium_jupiter.tools;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {

	public static String getDateTimeNow(){
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm_dd-MM-yy");		
		return date.format(formatter);		
	}
	
}