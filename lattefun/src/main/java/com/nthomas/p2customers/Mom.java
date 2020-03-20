package com.nthomas.p2customers;

import com.nthomas.p9p3utilities.Printer;

public class Mom extends Customer {
	Printer printer = new Printer();

	public void greeting() {
		printer.print("Hello, I mom, coffee?");
	}
	
}
