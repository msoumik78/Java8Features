package optional;

import java.util.Optional;

public class Java8Optional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Optional<String> language = Optional.of("Java");
	        Optional<String> emptyLanguage= Optional.empty();

	        if (language.isPresent()) {
	            System.out.println("Value available and value is :"+language.get());
	        } else {
	            System.out.println("Value not available.");
	        }

	        language.ifPresent(g -> System.out.println("In language Option, value available."));

	        emptyLanguage.ifPresent(g -> System.out.println("In emptyLanguage Option, value available."));		
		
	}

}
