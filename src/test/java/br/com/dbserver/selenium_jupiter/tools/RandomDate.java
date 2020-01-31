package br.com.dbserver.selenium_jupiter.tools;

import java.time.LocalDate;
import java.util.Random;

public class RandomDate {  

    public static String[] nextDate() {
    	 LocalDate minDate = LocalDate.of(1970, 1, 1);
    	 LocalDate maxDate = LocalDate.of(2010, 1, 1);
    	 Random random     = new Random();    	
        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        return LocalDate.ofEpochDay(randomDay).toString().split("-");
    }

   
}