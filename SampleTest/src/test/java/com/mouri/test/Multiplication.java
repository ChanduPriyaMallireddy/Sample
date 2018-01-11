package com.mouri.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Multiplication {

	@Test
	public void test() {
		ArithemathicOperations arithemathic =new ArithemathicOperations();
		assertEquals((Number) 200,(Number) arithemathic.Multiplication(20,10));
		System.err.println("Actual ::::::::::::::::::::"
				+ arithemathic.Multiplication(20,10));
 }
}
