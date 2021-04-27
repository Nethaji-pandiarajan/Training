package in.nethaji.cabtype;

import java.util.HashMap;
import java.util.Scanner;



public class TestKeyValue {
	
	public static void main(String[] args) {
		//key, Value
		
		HashMap<String,Integer>cabTypes = new HashMap<String,Integer>();
		cabTypes.put("micro", 10);
		cabTypes.put("mini", 15);
		cabTypes.put("prime", 20);
		
		System.out.println("No of cabtypes:" +cabTypes.size());
		
		//Get price for mini
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cabtypes: ");
		String cab = sc.next();
		System.out.println(cab);
	    Integer price = cabTypes.get(cab);
		System.out.println("The price of the " +cab+ " "  + price);
	}
}
