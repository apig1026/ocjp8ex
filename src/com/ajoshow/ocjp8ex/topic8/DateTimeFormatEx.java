package com.ajoshow.ocjp8ex.topic8;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatEx {

	public static void main(String... args) throws IOException {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(DateTimeFormatter.ISO_DATE));
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss")));
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss",Locale.TAIWAN)));
	}
}
