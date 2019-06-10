package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {

	public static void main(String[] args) {
		String[] wordsArray = { "Java Core", "Java EE", "Scala", "Python", "Closure" };
		demonstrateForEach(wordsArray);
		demonstrateFilter(wordsArray);
		demonstrateMap(wordsArray);		
	}

	private static void demonstrateForEach(String[] wordsArray) {
		System.out.println("******** Demonstrating forEach iterations ***********");
		List<String> wordList = Arrays.asList(wordsArray);
		wordList.forEach(System.out::println);
		System.out.println("*****************************************************");
	}

	private static void demonstrateFilter(String[] wordsArray) {
		System.out.println("******** Demonstrating filter operation ***********");		
		List<String> wordList = Arrays.asList(wordsArray);

		//Filtering only the words which start with 'J'
		List<String> filteredWordsList = wordList.stream().filter(n -> !n.startsWith("J")).collect(Collectors.toList());
		filteredWordsList.forEach(System.out::println);
		System.out.println("***************************************************");
	}
	
	
	private static void demonstrateMap(String[] wordsArray) {
		System.out.println("******** Demonstrating map operation ***********");		
		List<String> wordList = Arrays.asList(wordsArray);

		//Converting / transforming each word to uppercase
		List<String> transformedWordsList = wordList.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		transformedWordsList.forEach(System.out::println);
		System.out.println("***************************************************");
	}	
	

}
