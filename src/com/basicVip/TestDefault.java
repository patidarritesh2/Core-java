package com.basicVip;

public class TestDefault {
	public static void main(String[] args) {

		DefaultInt.staticMeth();

		DefaultInt d = () -> {};
		d.defaultMeth();

	}

}
