import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		
		//List obj = new ArrayList();
		
		List<String> departments = new ArrayList<String>();
		departments.add("CSE");
		departments.add("CSE");
		departments.add("MECH");
		System.out.println("ArrayList  = " +departments);
		
		
		//Set obj = new HasSet();
		
		HashSet<String> departments1 = new HashSet<String>();
		departments1.add("CSE");
		departments1.add("CSE");
		departments1.add("MECH");
		System.out.println("Set:"  + departments1);

	
	
	}
}
