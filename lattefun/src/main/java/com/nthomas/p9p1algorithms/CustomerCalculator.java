package com.nthomas.p9p1algorithms;

import java.util.Random;

import com.nthomas.p2customers.AverageJoe;
import com.nthomas.p2customers.BusinessMan;
import com.nthomas.p2customers.CollegeStudents;
import com.nthomas.p2customers.Customer;
import com.nthomas.p2customers.Hipster;
import com.nthomas.p2customers.Kids;
import com.nthomas.p2customers.Mom;
import com.nthomas.p2customers.OldPerson;
import com.nthomas.p2customers.VSCOGirl;
import com.nthomas.p2customers.Vegan;
import com.nthomas.p2customers.WorkingWoman;

public class CustomerCalculator {

	// int hipl, int hipu, int kidl, int kidu, int moml, int momu, int oldl, int
	// oldu, int vegl, int vegu, int vscol, int vscou, int csl, int csu, int bml,
	// int bmu, int wwl, int wwu

	public Customer CalculateCustomer(int hipsterProb, int kidsProb, int momProb, int oldProb, int vegProb,
			int vscoProb, int collegeProb, int businessProb, int workingWomanProb, int averageProb) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(100 + hipsterProb + kidsProb + momProb + oldProb + vegProb + vscoProb
				+ collegeProb + businessProb + workingWomanProb + averageProb);
		System.out.println(randomNumber);
		
		if (randomNumber >= 0 && 10 + hipsterProb > randomNumber) {
			return new Hipster();
		} else {
			if (randomNumber >= 10 + hipsterProb && 20 + kidsProb > randomNumber) {
				return new Kids();
			} else {
				if (randomNumber >= 20 + kidsProb && 30 + momProb > randomNumber) {
					return new Mom();
				} else {
					if (randomNumber >= 30 + momProb && 40 + oldProb > randomNumber) {
						return new OldPerson();
					} else {
						if (randomNumber >= 40 + oldProb && 50 + vegProb > randomNumber) {
							return new Vegan();
						} else {
							if (randomNumber >= 50 + vegProb && 60 + vscoProb > randomNumber) {
								return new VSCOGirl();
							} else {
								if (randomNumber >= 60 + vscoProb && 70 + collegeProb > randomNumber) {
									return new CollegeStudents();
								} else {
									if (randomNumber >= 70 + collegeProb && 80 + businessProb > randomNumber) {
										return new BusinessMan();
									} else {
										if (randomNumber >= 80 + businessProb && 90 + workingWomanProb > randomNumber) {
											return new WorkingWoman();
										} else {
											if (randomNumber >= 90 + workingWomanProb
													&& 100 + averageProb > randomNumber) {
												return new AverageJoe();
											} else {
												return new AverageJoe();
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public int customerFunder(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(min + (max - min));
	}

}
