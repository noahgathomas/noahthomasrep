package com.nthomas.p1operations;

import com.nthomas.p1controller.Player;
import com.nthomas.p2customers.Customer;
import com.nthomas.p9p1algorithms.CustomerCalculator;
import com.nthomas.p9p3utilities.Printer;

public class OpenOperations {
	Printer printer = new Printer();
	CustomerCalculator cc = new CustomerCalculator();
	int customerAmount;
	
	public void customerInteractions(int thisDay, Player player) {
		int daysEarnings = 0;
		
		System.out.println("funds: " + player.getFunds());
		System.out.println("coffees: " + player.getInventory().getCoffee().getCount());
		//calculateCustomerAmount();
		int customerAmount = 3;
		
		while(customerAmount > 0)	{
		Customer thisCustomer = cc.CalculateCustomer();
		printer.print("Customer:");
		thisCustomer.greeting();
		printer.lineWait();
		printer.print("You give coffee");
		player.getInventory().getCoffee().setCount(player.getInventory().getCoffee().getCount() - 1);
		System.out.println("new coffee count: " + player.getInventory().getCoffee().getCount());
		printer.print("You get 15 gold");
		player.setFunds(player.getFunds() + 15);
		daysEarnings += 15;
		System.out.println("Your new funds: " + player.getFunds());
		customerAmount--;
		}
		
		printer.print("It's the end of the day!", "You made $ " + daysEarnings + " today.");
		// Generate customer interactions randomly with new instances of customers,
		// using their preferences.
		// Have a certain number, based on customer value, to be representative of *10
		// daily customers

		// player.displayStats(player);

	}

	public void daysEvent(int thisDay, Player player) {

		// player.displayStats(player);

	}

}
