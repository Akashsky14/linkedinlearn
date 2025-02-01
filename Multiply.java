package java_methods_assignment;

public class Multiply {

	public static int multiply(int value1 ,int value2, int value3) {
		
		return value1*value2*value3;}

	public static int multiply(int value1, int value2) {

		return value1 * value2;

	}

	public static void main(String[] args) {
		System.out.println(multiply(2, 3, 4));
		System.out.println(multiply(2, 3));

	}

}
