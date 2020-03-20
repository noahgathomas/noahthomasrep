package com.nthomas.p1controller;

import java.util.ArrayList;
import java.util.List;

import com.nthomas.p3inventory.Inventory;
import com.nthomas.p3inventory.Pastry;
import com.nthomas.p7coffeeshop.Coffeeshop;
import com.nthomas.p9p2conversions.TextConversions;

public class Player {
	TextConversions textConversion = new TextConversions();

	// Stats
	private String name;
	private int funds;
	private int likeability;
	private int happiness;
	private Coffeeshop brewhaha;
	private Inventory inventory;
	
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFunds() {
		return funds;
	}

	public void setFunds(int funds) {
		this.funds = funds;
	}

	public int getLikeability() {
		return likeability;
	}

	public void setLikeability(int likeability) {
		this.likeability = likeability;
	}

	public int getHappiness() {
		return happiness;
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public Coffeeshop getBrewhaha() {
		return brewhaha;
	}

	public void setBrewhaha(Coffeeshop brewhaha) {
		this.brewhaha = brewhaha;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	// Constructors
	Player() {
		// Defaults
		this.name = "Player";
		this.funds = 10000;
		this.likeability = 5;
		this.happiness = 5;
		this.brewhaha = new Coffeeshop();
		this.inventory = new Inventory();
	}

	Player(String name) {
		// Defaults with name
		this.name = name;
		this.funds = 10000;
		this.likeability = 5;
		this.happiness = 5;
		this.brewhaha = new Coffeeshop();
		this.inventory = new Inventory();
	}

	Player(String name, int funds, int likeability, int happiness) {
		// Defaults with name
		this.name = name;
		this.funds = funds;
		this.likeability = likeability;
		this.happiness = happiness;
		this.brewhaha = new Coffeeshop();
		this.inventory = new Inventory();
	}

	public void displayStats(Player player) {
		System.out.println(player.name + ",");
		System.out.println("You have $" + player.funds + ".00 left.");
		System.out.println("You are " + textConversion.likeabilityConversion(player.likeability) + " likeable,");
		System.out.println("You are feeling " + textConversion.happinessConversion(player.happiness) + " today.");
	}

}
