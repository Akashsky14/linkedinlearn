package java_methods_assignment;

//import java.util.Scanner;


public class Greet {
	
	
	public static void Greet() {

		System.out.println("greeting");
	}

	public static void Greet(String name) {

		System.out.println("greeting" + name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner takeInput = new Scanner(System.in);
		
		//takeInput.next();
		
		
		Greet();
		Greet("takeInput");
		
		
	}

}
