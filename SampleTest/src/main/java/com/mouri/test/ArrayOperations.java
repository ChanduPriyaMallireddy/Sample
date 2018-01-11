package com.mouri.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayOperations {

	
	public  Double getMaxofNumbers(List<BigDecimal> nList) {
		BigDecimal max = null;
		if (nList.size() != 0) {
			max = nList.get(0);
			for (int i = 1; i <= nList.size() - 1; i++) {
				if ((nList.get(i)).doubleValue() > max.doubleValue()) {
					max = nList.get(i);

				}
				
			}
		}
		return max.doubleValue();
	}

	public Double getMinofNumbers(List<BigDecimal> nList) {
		BigDecimal min = null;
		if (nList.size() != 0) {
			min = nList.get(0);
			for (int i = 1; i <= nList.size() - 1; i++) {
				if ((nList.get(i)).doubleValue() < min.doubleValue()) {
					min = nList.get(i);

				}
			}
		}
		return min.doubleValue();
	}
	
	public Double getSumofNumbers(List<BigDecimal> nList) {
		Double sum = 0.0;
		if (nList.size() != 0) {
			for (BigDecimal bd : nList) {
				sum += bd.doubleValue();
			}
		}
		return sum;
	}

	public Double getAvgofNumbers(List<BigDecimal> nList) {
		Double sum = getSumofNumbers(nList);
		return (sum / nList.size());
	}
//	public static void main(String[]args){
//		
//		List<BigDecimal> list = new ArrayList<BigDecimal>();
//		list.add(new BigDecimal(String.valueOf(10)));
//		list.add(new BigDecimal(String.valueOf(20)));
//		list.add(new BigDecimal(String.valueOf(30)));
//		list.add(new BigDecimal(String.valueOf(40)));
//		System.out.println("Array Operations:"+getSumofNumbers(list));
//		System.out.println("Array Operations:"+getAvgofNumbers(list));
//		System.out.println("Array Operations:"+getMinofNumbers(list));
//		System.out.println("Array Operations:"+getMaxofNumbers(list));
//		
//		
//		
//	
//}
}

