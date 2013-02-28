package ch.piet;

public class Dojo {

	public static final String EOL = System.getProperty("line.separator");
	
	private String top = "";
	private String middle = "";
	private String bottom = "";
	
	public String printInAscii(int i) {
		for (char ch : parseInput(i)) {
			buildDisplayLines(AsciiNumbersMap.getNumberCharAsAsciiStringArray(ch));
		}
		return top + EOL + middle + EOL + bottom;
	}

	private char[] parseInput(int inputAsInt) {
		String input = Integer.toString(inputAsInt);
		if (input.length() > 7) {
			throw new IllegalArgumentException("too long input");
		}
		return input.toCharArray();
	}

	private void buildDisplayLines(String[] ascii) {
		top    += ascii[0];
		middle += ascii[1];
		bottom += ascii[2];
	}
}
