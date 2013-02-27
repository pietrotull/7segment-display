package ch.piet;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DojoTest {

	private Dojo dojo;

	private final String EOL = Dojo.EOL;
	
	private String zero = 
			" _ " + EOL +
			"| |" + EOL +
			"|_|";

	private String ten = 
			"    _ " + EOL +
			"  || |" + EOL +
			"  ||_|";

	private String ascii123 = 
			"    _  _ " + EOL +
			"  | _| _|" + EOL +
			"  ||_  _|";

	private String ascii9876543 = 
			" _  _  _  _  _     _ " + EOL +
			"|_||_|  ||_ |_ |_| _|" + EOL +
			" _||_|  ||_| _|  | _|";
	
	@Before
	public void setUp() {
		dojo = new Dojo();
	}
	
	@Test
	public void ZeroIntShouldReturnAsciiZero() {
		String result = dojo.printInAscii(0);
		System.out.println(result);
		assertEquals(zero, result);
	}
	
	@Test
	public void tenShouldReturnTenAsAscii() {
		String result = dojo.printInAscii(10);
		System.out.println(result);
		assertEquals(ten, result);
	}
	
	@Test
	public void int123ShouldReturn123AsAscii() {
		String result = dojo.printInAscii(123);
		System.out.println(result);
		assertEquals(ascii123, result);
	}
	
	@Test
	public void int9876543ReturnsTheSameAsAscii() {
		String result = dojo.printInAscii(9876543);
		System.out.println(result);
		assertEquals(ascii9876543, result);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void invalidInputThrowsAnError() {
		dojo.printInAscii(123456789);
	}

}