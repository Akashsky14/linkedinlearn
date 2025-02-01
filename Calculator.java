package java_methods_assignment;

	public class Calculator {

		static double value3;
		static double value4;
		static double value5;

		public static double add(double value1, double value2) {
			System.out.println("Addition is " + (value1 + value2));
			return value3 = value1 + value2;
		}

		public static double subtract(double value1) {
			
			System.out.println( "Subtraction is " + (value1 - value3));
			return value4 = value1 - value3;
		}

		public static double multiply(double value1) {
			System.out.println("Multiply is " + value1 * value4);
			return value5 = value1 * value4;

		}

		public static double divide(double value1) {
			
			System.out.println("Divide is " + value1 / value5);

			return value1 / value5;
		}

		

		public static void main(String[] args) {
			// TODO Auto-generated method stub;

			double methodchaining = add(1,2) * subtract(2) * multiply(3) * divide(4);
			System.out.println(methodchaining);

		}

	}



