

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		//Create a List 
		ArrayList<String> cabTypes = new ArrayList<String>();
		//Add Items in the list
		cabTypes.add("micro");
		cabTypes.add("mini");
		cabTypes.add("prime");
		
		//Display cab types	
		
		for (String type : cabTypes) {
			System.out.println(type);
		}
		
		// Total NO of cab types 
		
		System.out.println("No of cab types ? " +cabTypes.size());
		
		//Search the cab types Existence
		
		boolean exists = false;
		String 	searchCabType = "micro";
		for (String type : cabTypes) {
			if(type.equalsIgnoreCase(searchCabType)) {
				exists = true;
				break;
			}
		}
		System.out.println(searchCabType + " exists ?" + exists);
		//boolean isExists = cabTypes.contains("micro");
		//System.out.println("Search Cab Type+ "exists ? " +isExists);
		
		
		//Remove cabTypes
		
		int index = cabTypes.indexOf("prime");
		System.out.println("Index ?" +index);
		//cabTypes.remove(2);
		cabTypes.remove(index);
		
		
		//Remove all items in the array List
		//CabTypes.clear();
		
		//Update
		cabTypes.set(1, "prime");
		System.out.println(cabTypes);
	}
}
