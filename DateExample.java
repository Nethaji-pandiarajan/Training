package com.chainsys;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateExample {
	
	public static void main(String[] args) {
	
	LocalDate now = LocalDate.now();
	System.out.println(now);
	
	LocalTime time = LocalTime.now();
	System.out.println(time);
	
	LocalDateTime date = LocalDateTime.now();
	System.out.println(date);
	

	LocalDate dateOfBirth = LocalDate.parse("1999-10-14");
	System.out.println(dateOfBirth);		
}
}
