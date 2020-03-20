package com.nthomas.p3inventory;

public class Inventory {
	Coffee coffee;
	Milk milk;
	Pastry pastry;
	Sugar sugar;
	Syrup syrup;

	Tea tea;

	public Inventory() {
		this.coffee = new Coffee();
		this.milk = new Milk();
		this.pastry = new Pastry();
		this.sugar = new Sugar();
		this.syrup = new Syrup();

	}

	public Coffee getCoffee() {
		return coffee;
	}

	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	public Milk getMilk() {
		return milk;
	}

	public void setMilk(Milk milk) {
		this.milk = milk;
	}

	public Pastry getPastry() {
		return pastry;
	}

	public void setPastry(Pastry pastry) {
		this.pastry = pastry;
	}

	public Sugar getSugar() {
		return sugar;
	}

	public void setSugar(Sugar sugar) {
		this.sugar = sugar;
	}

	public Syrup getSyrup() {
		return syrup;
	}

	public void setSyrup(Syrup syrup) {
		this.syrup = syrup;
	}

	public Tea getTea() {
		return tea;
	}

	public void setTea(Tea tea) {
		this.tea = tea;
	}

}
