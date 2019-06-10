
public class Java8LambdasDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Java8FunctionalInterface java8Lambdas = (n) -> Math.sqrt(n);
		System.out.println("SquareRoot of 16 is : "+java8Lambdas.findSquareRoot(16));
		System.out.println("SquareRoot of 9 is : "+java8Lambdas.findSquareRoot(9));		

	}

}
