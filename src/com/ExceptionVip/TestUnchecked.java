package com.ExceptionVip;

public class TestUnchecked {

	public static void main(String[] args) {
		
		int i = 5;
		
		if (i!=5) {
			System.out.println("i is not equal");
		}else {
			 UncheckedCustomException r = new UncheckedCustomException();
			
			throw r;
		}
	}
}
