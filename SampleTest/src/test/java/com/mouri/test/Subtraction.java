package com.mouri.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Subtraction {

	@Test
	public void test() {
		ArithemathicOperations arithemathic =new ArithemathicOperations();
		assertEquals((Number) 10,(Number) arithemathic.subtraction(20,10));
		System.err.println("Actual ::::::::::::::::::::"
				+ arithemathic.subtraction(20,10));
	}

}
