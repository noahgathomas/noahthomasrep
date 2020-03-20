package com.nthomas.p9p3utilities;

import java.util.Scanner;

public class ScannerSingleton {
	private static ScannerSingleton scannerSingleton;
	private Scanner scanner;

	private ScannerSingleton() {
		super();
		scanner = new Scanner(System.in);
	}

	public static synchronized ScannerSingleton getScannerSingleton() {
		if (scannerSingleton == null) {
			scannerSingleton = new ScannerSingleton();
		}
		return scannerSingleton;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void close() {
		scanner.close();
	}

}
