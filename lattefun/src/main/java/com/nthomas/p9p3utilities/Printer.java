package com.nthomas.p9p3utilities;

import java.util.concurrent.TimeUnit;

public class Printer {

	public void print(String myString) {
		for (char c : myString.toCharArray()) {
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}

	public void print(String myString, String myString2) {
		for (char c : myString.toCharArray()) {
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		try {
			TimeUnit.MILLISECONDS.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (char ch : myString2.toCharArray()) {
			System.out.print(ch);
			try {
				TimeUnit.MILLISECONDS.sleep(45);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		lineWait();
	}

	public void printNoEnter(String myString) {
		for (char c : myString.toCharArray()) {
			System.out.print(c);
			try {
				TimeUnit.MILLISECONDS.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void lineWait() {
		try {
			TimeUnit.MILLISECONDS.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void loadingScreen() {
		System.out.println();
		try {
			TimeUnit.MILLISECONDS.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("Loading");
		for (int i = 0; i < 3; i++) {
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println();
		System.out.println();
	}

}
