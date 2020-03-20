package com.nthomas.p9p1algorithms;

import java.util.Random;

public class ProbabilityAlgorithm {

	public boolean probability(int ifThis, int outOfThis) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(outOfThis);

		if (randomNumber == ifThis) {
			return true;
		} else {
			return false;
		}
	}

}
