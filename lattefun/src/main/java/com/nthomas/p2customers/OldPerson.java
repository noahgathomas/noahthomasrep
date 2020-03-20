package com.nthomas.p2customers;

import com.nthomas.p9p3utilities.Printer;

public class OldPerson extends Customer {
	Printer printer = new Printer();
	
	public void greeting() {
		printer.print("Yee old me! Cofee pls!");
	}
	
}
