package com.mouri.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Addition {

	@Test
	public void test() {
		ArithemathicOperations arithemathic =new ArithemathicOperations();
		assertEquals((Number) 30,(Number) arithemathic.addition(10,20));
		System.err.println("Actual ::::::::::::::::::::"
				+ arithemathic.addition(10,20));
	}

}
