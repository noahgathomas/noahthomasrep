package com.nthomas.p2customers;

import com.nthomas.p9p3utilities.Printer;

public class CollegeStudents extends Customer {
	Printer printer = new Printer();

	public void greeting() {
		printer.print("can I have a water and sit in that booth over there for 45 minutes?");
	}
	
}
