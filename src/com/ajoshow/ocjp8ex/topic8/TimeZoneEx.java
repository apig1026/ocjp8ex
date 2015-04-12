package com.ajoshow.ocjp8ex.topic8;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneEx {

	public static void main(String... args) throws IOException {
		LocalDateTime now = LocalDateTime.now();

	    ZoneId zid1 = ZoneId.of("Asia/Tokyo");
	    ZonedDateTime t1 = ZonedDateTime.of(now, zid1);
	    System.out.println("Time at Tokyo zone now: " + t1);

	    ZoneId zid2 = ZoneId.of("America/Los_Angeles");
	    ZonedDateTime t2 = t1.withZoneSameInstant(zid2);
	    System.out.println("Same time at LA zone: " + t2);
	    
	    Duration daySaving = zid2.getRules().getDaylightSavings(Instant.now());
	    System.out.println("LA zone day light saving offset: " + daySaving);
	    
	    System.out.println("Same time at LA zone with day light saving: " + t2.minusSeconds(daySaving.getSeconds()));
				
	}
}
