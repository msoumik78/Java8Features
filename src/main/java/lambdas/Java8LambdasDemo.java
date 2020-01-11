package lambdas;

public class Java8LambdasDemo {

	public static void main(String[] args) {
		
		Java8FunctionalInterface1 java8Lambda1 = () -> System.out.println("Greeting from FunctionalInterace1");
		java8Lambda1.showStaticMessage();
		
		Java8FunctionalInterface2 java8Lambda2 = (String msg) -> System.out.println("Greeting from FunctionalInterace2 :"+msg);
		java8Lambda2.showDynamicMessage("Hi from main method");
		
		Java8FunctionalInterface3 java8Lambda3 = (int number) ->Math.sqrt(number);
		System.out.println("Output from FunctionalInterace3 : Square root of 16 = "+java8Lambda3.findSquareRoot(16));
		
		Java8FunctionalInterface4 java8Lambda4 = (int number1, int number2) -> number1 * number2;
		System.out.println("Output from FunctionalInterace4 : Multiply 4 and 6 = "+java8Lambda4.multiply(4,6));

	}

}
