package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import triangle.Triangle;
import triangle.Triangle.TriangleType;


public class TriangleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception { //go
	}

	@Test
	public void test1() {
		assertEquals(Triangle.classify(1, 1, 1),TriangleType.EQUILATERAL);
	}
	
	@Test
	public void test2() {
		assertEquals(Triangle.classify(1, 4, 1),TriangleType.INVALID);
	}


}
