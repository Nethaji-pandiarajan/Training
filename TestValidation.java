import java.util.*;
public class TestValidation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mark");
		int marks = sc.nextInt();
		
		String Grade =null;
		if(marks >90 ) {
			Grade ="A";
		}
		else if(marks >=90 && marks >=50) 
		{
			Grade ="B";
			}
		else
		{
			Grade ="F";
			}
		
		System.out.println("marks=" +marks);
		System.out.println("Grade=" +Grade);
	}
}
