package optional;

import java.util.Optional;

public class Java8Optional {

	public static void main(String[] args) {

	     Optional<String> javaLanguage = Optional.of("Java");
	        Optional<String> emptyLanguage= Optional.empty();

	        if (javaLanguage.isPresent()) {
	            System.out.println("Value available and value is :"+javaLanguage.get());
	        } else {
	            System.out.println("Value not available.");
	        }

	        javaLanguage.ifPresent(g -> System.out.println("In language Option, value available."));

	        emptyLanguage.ifPresent(g -> System.out.println("In emptyLanguage Option, value available."));		
		
	}

}
