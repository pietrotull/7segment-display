package ch.piet;

import java.util.HashMap;
import java.util.Map;

public class AsciiNumbersMap {

	private static final Map<Character, String[]> numbers = new HashMap<>();
	
	static {
		put('0', " _ ",
				 "| |",
				 "|_|");
		
		put('1', "   ",
				 "  |",
				 "  |");
		
		put('2', " _ ",
				 " _|",
				 "|_ ");
		
		put('3', " _ ",
				 " _|",
				 " _|");
		
		put('4', "   ",
				 "|_|",
				 "  |");
		
		put('5', " _ ",
				 "|_ ",
				 " _|");
		
		put('6', " _ ",
				 "|_ ", 
				 "|_|");
		
		put('7', " _ ",
				 "  |",
				 "  |");
		
		put('8', " _ ", 
				 "|_|",
				 "|_|");
		
		put('9', " _ ",
				 "|_|",
				 " _|");
	}
	
	public static String[] getNumberCharAsAsciiStringArray(Character number) {
		return numbers.get(number);
	}
	
	private static void put(Character key, String row0, String row1, String row2) {
		numbers.put(key, new String[] {row0, row1, row2});
	}
}
