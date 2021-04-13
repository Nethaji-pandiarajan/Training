
public class Additionapp {

	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {
		int a, b;
		a = 10;
		b = 5;
		int result = add(a, b);
		System.out.println("The addition of both the number is:" + result);
	}
}
