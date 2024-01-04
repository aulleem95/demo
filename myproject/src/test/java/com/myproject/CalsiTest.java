package com.myproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalsiTest {
	
	Calci c;
	
	//setup method is responsible to initialize resources
	@Before
	public void setUp() throws Exception {
		c=new Calci();
	}

	//tearDown method is responsible to initialize resources
	@After
	public void tearDown() throws Exception {
		c=null;
	}

	//it is a test case
	@Test
	public void testAdd() {
		int result=c.add(4, 5);
		assert result>5: "value should be greater than 5";
	}

	@Test
	public void testSub() {
		int result=c.sub(4, 5);
		assert result>5: "value should be greater than 5";
	}

	@Test
	public void testDiv() {
		int result=c.div(4, 5);
		assert result>5: "value should be greater than 5";
	}

}
