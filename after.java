package com.chainsys;

import java.time.LocalDate;
import java.time.LocalTime;

public class after {
	
	public static void main(String[] args) {
		
		LocalDate Currentdate = LocalDate.now();
		LocalDate DateOfBirth = LocalDate.parse("2021-04-15");
		
		if(DateOfBirth.isBefore(Currentdate)) {
			System.out.println("The Date of birth is before the current date");
			
		}
		
		if(DateOfBirth.isAfter(Currentdate)) {
			System.out.println("The Date of birth is after the current date");
			
		}
		

		if(DateOfBirth.isEqual(LocalDate.now())) {
			System.out.println("The given date is matched with todays date");
		}
		
		
		LocalTime cabtime = LocalTime.parse("16:30:00");
		int hour = cabtime.getHour();
		System.out.println("Hour" +hour);
		if(hour>=16 && hour <=18) {
			System.out.println("Peak Hour");
		}
		
	}

}
