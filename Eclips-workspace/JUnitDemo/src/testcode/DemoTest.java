package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.Demo;

public class DemoTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Test Case");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Test Case");
	}

	@Test
	public void testFindMax() {
		System.out.println("Test Case to find Max");
		assertEquals(20, Demo.findMax(new int[] {20,2,10,15}));
		assertEquals(-2, Demo.findMax(new int[] {-12,-2,-4,-222}));
	}

	@Test
	public void testCube() {
		System.out.println("Test Case Cube");
		assertEquals(27, Demo.cube(3));
	}

	@Test
	public void testReverseWord() {
		System.out.println("Test Case Reverse word");
		assertEquals("madam",Demo.reverseWord("madam"));
	}

}
