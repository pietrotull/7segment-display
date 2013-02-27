package ch.piet;

public class Dojo {

	public static final String EOL = System.getProperty("line.separator");
	
	private String top = "";
	private String middle = "";
	private String bottom = "";
	
	public String printInAscii(int i) {
		for (char ch : parseInput(i)) {
			processChar(ch);
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

	private void processChar(char ch) {
		switch (ch) {
		case '0':
			print0();
			break;
		case '1':
			print1();
			break;
		case '2':
			print2();
			break;
		case '3':
			print3();
			break;
		case '4':
			print4();
			break;
		case '5':
			print5();
			break;
		case '6':
			print6();
			break;
		case '7':
			print7();
			break;
		case '8':
			print8();
			break;
		case '9':
			print9();
			break;
		default:
			throw new RuntimeException("Not a number");
		}
	}

	private void print9() {
		top    += " _ ";
		middle += "|_|";
		bottom += " _|";
	}

	private void print8() {
		top    += " _ ";
		middle += "|_|";
		bottom += "|_|";
	}

	private void print7() {
		top    += " _ ";
		middle += "  |";
		bottom += "  |";
	}

	private void print6() {
		top    += " _ ";
		middle += "|_ ";
		bottom += "|_|";
	}

	private void print5() {
		top    += " _ ";
		middle += "|_ ";
		bottom += " _|";
	}

	private void print4() {
		top    += "   ";
		middle += "|_|";
		bottom += "  |";
	}

	private void print3() {
		top    += " _ ";
		middle += " _|";
		bottom += " _|";
	}

	private void print2() {
		top    += " _ ";
		middle += " _|";
		bottom += "|_ ";
	}

	private void print1() {
		top    += "   ";
		middle += "  |";
		bottom += "  |";
	}

	private void print0() {
		top    += " _ ";
		middle += "| |";
		bottom += "|_|";
	}
}
