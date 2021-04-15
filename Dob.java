package com.chainsys;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Dob {

	public static void main(String[] args) {
		
		Scanner date= new Scanner(System.in);
		System.out.println("Enter your Date of Birth:");
		String dob= date.next();
		LocalDate a=LocalDate.parse(dob);
		System.out.println(dob);
		System.out.println(a);
		
		String time="14:20:00";
		LocalTime b=LocalTime.parse(time);
		System.out.println(b);
		
		
		
	}
}
