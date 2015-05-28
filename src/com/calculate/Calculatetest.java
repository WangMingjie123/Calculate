package com.calculate;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculatetest {
	Calculate mycal=new Calculate();
	@Before
	public void setUp(){
		System.out.println("≤‚ ‘ø™ º");
	}
	@After
	public void down()
	{
		System.out.println("≤‚ ‘Ω· ¯");
	}
	@Test
	public void testAdd() {
		assertEquals(8,mycal.add(2, 6));
	}
	@Test
	public void testsubtract() {
		assertEquals(2,mycal.subtract(4,2));
		assertEquals(7,mycal.subtract(9, 2));
	}
	@Test
	public void testmultiply() {
		assertEquals(15,mycal.multiply(3, 5));
		assertEquals(12,mycal.multiply(3, 4));
	}
	@Test
	public void testdivide() {
		assertEquals(1,mycal.divide(4, 4));
		assertEquals(0,mycal.divide(4, 0));
		assertEquals(2,mycal.divide(4, 2));
	}
	

}
