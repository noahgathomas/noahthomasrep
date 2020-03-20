package com.nthomas.p8events;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.nthomas.p9p2conversions.TextConversions;
import com.nthomas.p9p3utilities.Printer;
import com.nthomas.p9p3utilities.ScannerSingleton;

public class Introduction {

	// helper class instances ////
	Printer printer = new Printer();
	TextConversions textConversion = new TextConversions();
	private static Scanner scan = ScannerSingleton.getScannerSingleton().getScanner();
	// helper class instances ////

	public String introductionText() {
/*		printer.print("Your dad ", "is dead.");
		try {
			TimeUnit.MILLISECONDS.sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printer.print("He was the owner/operator of \"The Brew-Ha-Ha,\" ", "his greatest passion and refuge.");
		printer.print("You just graduated college, and you've been looking for the right job.");
		printer.print("You grew up watching him spread caffeine, ", "and kindness.");
		printer.print("Now you can carry on his legacy, ", "or drag it through the mud.");
		System.out.println();*/
		printer.print("Please enter your name:");
		System.out.print("-");
		String name = textConversion.nameify(scan.nextLine());
		printer.print("Welcome to The Brew-Ha-Ha, ", name + ".");
		printer.loadingScreen();
		return name;
	}

}
