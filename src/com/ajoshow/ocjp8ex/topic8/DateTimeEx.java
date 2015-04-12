package com.ajoshow.ocjp8ex.topic8;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimeEx {

	public static void main(String... args) throws IOException {
	    /* LocalDate */
	    LocalDate specificDate = LocalDate.of(2015, 10, 26);
	    LocalDate todayDate = LocalDate.now();
	    
	    /* LocalTime */
	    LocalTime specificTime = LocalTime.of(23, 59, 59);
	    LocalTime nowTime = LocalTime.now();

	    /* LocalDateTime */
	    System.out.println(LocalDate.parse("2015-10-26"));
	    System.out.println(LocalTime.parse("23:59:59"));
	    LocalDateTime specificDateTime = LocalDateTime.of(1985, Month.OCTOBER, 26, 23, 59, 29);
	    LocalDateTime nowDateTime = LocalDateTime.now();
	   
	    /* Instant */
	    // 1 Million seconds since the Unix epoch time
	    Instant oneMSInstant = Instant.ofEpochSecond(1_000_000_000); 
	    Instant nowInstant = Instant.now(); // seconds since the Unix epoch time to now

	    /* Duration */  // A date-based amount of time 
	    Duration.between(specificTime, nowTime);

	    /* Period */  // A date-based amount of time 
	    Period.between(specificDate, todayDate);
				
	}
}
