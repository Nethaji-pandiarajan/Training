import java.util.HashMap;
import java.util.Set;

public class DepartmentMap {
	public static void main(String[] args) {
		
		//CSE (Key) = Computer Science(value)
		
		HashMap<String, String> departments = new HashMap <String , String>();
		departments.put("CSE" , "Computer Science");
		departments.put("EEE", "Electrical Engineering");
		departments.put("MECH", "Mechanical");
		
		//Display all the departmental details
		
		Set<String> keySet = departments.keySet();
		for(String key : keySet) {
			String value = departments.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
