package com.nthomas.p2customers;

import com.nthomas.p9p1algorithms.CustomerCalculator;
import com.nthomas.p9p3utilities.Printer;

public class Hipster extends Customer {
	int funds;
	
	Printer printer = new Printer();
	CustomerCalculator cc = new CustomerCalculator();
	
	public Hipster()	{
		funds = cc.customerFunder(5, 15);
	}
	
	
	public void greeting() {
		printer.print("Can you just give me a picture of latte art?");
	}
	
}
