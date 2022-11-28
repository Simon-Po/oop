package com.cc.java;


// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.Month;

import java.time.*;
import java.util.Calendar;

public class App {

	public static void main(String[] args) {
		
		ausgabe("---------- Datum / Ausgaben --------------------");
		
		// aktuelle Datum
		LocalDate today = LocalDate.now();
		ausgabe("Heutiges Datum: " + today);
		
		// bestimmtes Datum
		LocalDate givenDate = LocalDate.of(2012, Month.SEPTEMBER, 21);
		ausgabe("Bestimmtes Datum: " + givenDate);
		
		// nächste Woche
		LocalDate aWeekFromToday = today.plusWeeks(1);
		ausgabe("Datum in einer Woche: " + aWeekFromToday);
		
		// gestern
		LocalDate yesterday = today.minusDays(1);
		ausgabe("Gestern: " + yesterday);		
	
		
		ausgabe("---------- Vergleiche --------------------");
		
		ausgabe("Schaltjahr?: " + givenDate.isLeapYear() );
		ausgabe("Heute/Gestern: " + today.isAfter(yesterday) );
		ausgabe("Gestern/Heute: " + yesterday.isBefore(today));
		ausgabe("heute/heute: " + today.isEqual(yesterday));
		

		ausgabe("---------- Extraktion --------------------");
	
		int year = today.getYear();
		ausgabe("aktuelles Jahr: " + year );
		
		givenDate = LocalDate.of(2020, Month.OCTOBER, 9);		
		String weekday = givenDate.getDayOfWeek().name();
		ausgabe("Wochentag: " + weekday );
		ausgabe("Thank God it's " + weekday );
		ausgabe("Tag im Monat: " + today.getDayOfMonth());
		
		ausgabe("---------- Zeit / Ausgaben --------------------");
		
		LocalTime justNow = LocalTime.now();
		ausgabe("Jetzt: " + justNow );
		
		LocalTime newTime = LocalTime.of(12, 00);
		ausgabe("Mittag: " + newTime );
		
		LocalTime inOneHour = justNow.plusHours(1);
		ausgabe("In einer Stunde: " + inOneHour );
		
		ausgabe("---------- Extraktion --------------------");
		
		int hour = justNow.getHour(); // hora
		ausgabe("H: " + hour );
		
		int minute = justNow.getMinute();
		ausgabe("MIN: " + minute );
		
		ausgabe("---------- DateTime --------------------");
		
		LocalDateTime timeStamp = LocalDateTime.now();
		ausgabe("timeStamp: " + timeStamp );
		
		System.out.println("---------- Kalenderwoche --------------------");
		
        Calendar cal = Calendar.getInstance();
        ausgabe("Kalenderwoche: " + cal.get(Calendar.WEEK_OF_YEAR)); 

	}

	public static void ausgabe(String outputStr) {
		System.out.println(outputStr);  
	  }

}
