package telran.strings.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void charAtTest() {
		String str = "Hello";
		assertEquals('H', str.charAt(0));
		assertEquals('o', str.charAt(4));
		assertEquals('l', str.charAt(2));
		assertEquals('c', 'e' - 2);
		assertEquals("Hello2", str + 2);
	}
	@Test
	void containTest() {
		String str = "Hello";
		assertTrue(str.contains("H"));
		assertFalse(str.contains("h"));
		assertTrue(str.contains("ello"));
		assertFalse(str.contains("lelo"));
	}
	@Test
	void compareToTest() {
		String str = "Hello";
		assertEquals(0, str.compareTo("Hello"));
		assertEquals(32, str.compareTo("HELLO"));
		assertEquals(-5, str.compareTo("Mother"));
		assertEquals(1, str.compareTo("Hell"));
		assertEquals(-32, str.compareTo("hello"));
		assertEquals(7, str.compareTo("Abcd"));
		
	}
	@Test
	void compareToIgnoreCaseTest() {
		String str = "Hello";
		assertEquals(0, str.compareToIgnoreCase("HELLO"));
		assertEquals(0, str.compareToIgnoreCase("hello"));
		assertEquals(-4, str.compareToIgnoreCase("Lohle"));
		assertEquals(-5, str.compareToIgnoreCase("mother"));
		assertEquals(1, str.compareToIgnoreCase("Hell"));
		assertEquals(7, str.compareToIgnoreCase("Abcde"));
	}
	@Test
	void concatTest() {
		String str = "To";
		assertEquals("Together", str.concat("get").concat("her"));
		assertEquals("Today", str.concat("day"));
		assertEquals("Topic", str.concat("pic"));
	}
	@Test
	void startsWithTest() {
		String str = "Hello";
		assertTrue(str.startsWith(""));
		assertTrue(str.startsWith("Hello"));
		assertTrue(str.startsWith("Hel"));
		assertFalse(str.startsWith("M"));
		assertFalse(str.startsWith("Hello!"));
	}
	@Test
	void endsWithTest() {
		String str = "Hello";
		assertTrue(str.endsWith(""));
		assertTrue(str.endsWith("Hello"));
		assertTrue(str.endsWith("lo"));
		assertFalse(str.endsWith("e"));
		assertFalse(str.endsWith("TheHello"));
	}
	@Test
	void equalsIgnoreCaseTest() {
		String str = "Hello";
		assertTrue(str.equalsIgnoreCase("HELLO"));
		assertTrue(str.equalsIgnoreCase("hello"));
		assertFalse(str.equalsIgnoreCase(""));
		assertFalse(str.equalsIgnoreCase("elloh"));
	}
	@Test
	void indexOfTest() {
		String str = "To be or not to be";
		assertEquals(3, str.indexOf("be"));
		assertEquals(13, str.indexOf("to"));
		assertEquals(0, str.indexOf("To"));
		assertEquals(-1, str.indexOf("pic"));
	}
	@Test
	void lastIndexOfTest() {
		String str = "To be or not to be";
		assertEquals(17, str.lastIndexOf('e'));
		assertEquals(9, str.lastIndexOf('n'));
		assertEquals(0, str.lastIndexOf('T'));
		assertEquals(-1, str.lastIndexOf('p'));
	}
	

}
