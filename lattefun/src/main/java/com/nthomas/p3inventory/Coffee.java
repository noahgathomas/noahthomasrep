package com.nthomas.p3inventory;

public class Coffee {
	int count = 0;
	
	Coffee()	{
	this.count = 0;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public void addToCount(int addition)	{
		this.count += addition;
	}

	public void takeFromCount(int subtraction)	{
		this.count -= subtraction;
	}


}
