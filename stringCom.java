package com.chainsys;

public class stringCom {

	public static void main(String[] args) {
		String CabType ="mIcro";
		if(CabType.equals("micro")) {
			System.out.println("equal");
		}
		if(CabType.equalsIgnoreCase("Micro")) {
			System.out.println("Ignored case sensitive Successfully");
		}
		
		
	}
}
