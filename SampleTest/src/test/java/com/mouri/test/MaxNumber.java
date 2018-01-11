package com.mouri.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class MaxNumber {

	@Test
	public void test() {
		ArrayOperations array =new ArrayOperations();
		List<BigDecimal> list = new ArrayList<BigDecimal>();
     	list.add(new BigDecimal(String.valueOf(10)));
    	list.add(new BigDecimal(String.valueOf(20)));
    	list.add(new BigDecimal(String.valueOf(30)));
    	list.add(new BigDecimal(String.valueOf(40)));
		assertEquals((Number) 40.0,(Number) array.getMaxofNumbers(list));
		System.err.println("Actual ::::::::::::::::::::"
				+ array.getMaxofNumbers(list));
		
	}

}

//public static void main(String[]args){
////	
////	List<BigDecimal> list = new ArrayList<BigDecimal>();
////	list.add(new BigDecimal(String.valueOf(10)));
////	list.add(new BigDecimal(String.valueOf(20)));
////	list.add(new BigDecimal(String.valueOf(30)));
////	list.add(new BigDecimal(String.valueOf(40)));