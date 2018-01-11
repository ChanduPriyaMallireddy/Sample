package com.mouri.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AvgOfNumbers {

	@Test
	public void test() {
		ArrayOperations array =new ArrayOperations();
		List<BigDecimal> list = new ArrayList<BigDecimal>();
     	list.add(new BigDecimal(String.valueOf(10)));
    	list.add(new BigDecimal(String.valueOf(20)));
    	list.add(new BigDecimal(String.valueOf(30)));
    	list.add(new BigDecimal(String.valueOf(40)));
		assertEquals((Number) 25.0,(Number) array.getAvgofNumbers(list));
		System.err.println("Actual ::::::::::::::::::::"
				+ array.getAvgofNumbers(list));
		
	}
	}

