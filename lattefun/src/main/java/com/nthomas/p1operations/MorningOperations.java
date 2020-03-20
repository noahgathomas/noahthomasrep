package com.nthomas.p1operations;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.nthomas.p1controller.Player;
import com.nthomas.p9p2conversions.NumberConversions;
import com.nthomas.p9p2conversions.TextConversions;
import com.nthomas.p9p3utilities.Printer;
import com.nthomas.p9p3utilities.ScannerSingleton;

public class MorningOperations {
	
	boolean isCoffeeOn = false;
	
	// 						helper class instances 						////
	Printer printer = new Printer();
	private static Scanner scan = ScannerSingleton.getScannerSingleton().getScanner();
	NumberConversions numberConversions = new NumberConversions();
	TextConversions textConversions = new TextConversions();
	// 						helper class instances 						////
	
	
	
	//////////////////////////////////////////////////////////////////////////////
	// 								SET UP METHOD 								//

	public Map<String, Boolean> setUp(int thisDay, Player player) {
		System.out.println(player.getInventory().getPastry().getCount());
		Map<String, Boolean> state = new TreeMap<String, Boolean>();
		printer.print("It's five a.m. and time to set up the cafe.");
		printer.print("You also have time to run to the store.");

		// firstdaymessage ->
		if (thisDay == 1) {
			printer.print("It's your first day, so you want to make sure you have enough cups and coffee,");
			printer.print("as well as milk and sugar. You'll also want to turn the coffeepot on.");
			printer.lineWait();
		}
		// firstdaymessage <-

		System.out.println();
		System.out.println("\"What do I want to do this morning?\" you think.");

		boolean flag = false;
		while (flag == false) {
			System.out.println("(Select an option by typing it in)");
			System.out.println("Turn the sign to Open."); // you also turn on the lights, and if there's a sound system
															// that too
			System.out.println("Take a breather.");
			System.out.println("Check your inventory.");
			System.out.println("Go shopping.");
			System.out.println("Put the coffee on.");
			// Also if you don't turn coffee on you'll lose a customer turning it on.
			if (player.getInventory().getPastry().getCount() > 0) {
				System.out.println("Prep pastries.");
			}
			System.out.println("More options...");
			System.out.print("-");

			// Input Mega if-else Statement
			String choice = scan.nextLine();
			if (choice.toLowerCase().contains("turn") || choice.toLowerCase().contains("sign")
					|| choice.toLowerCase().contains("open")
					|| choice.toLowerCase().contentEquals("turn the sign to open")) {
				flag = true;
				state.put("Coffee", turnSign(isCoffeeOn));
				state.putIfAbsent("Pastries", false);
				return state;
			} else {
				if (choice.toLowerCase().contains("breathe") || choice.toLowerCase().contains("breather")
						|| choice.toLowerCase().contains("take")
						|| choice.toLowerCase().contentEquals("take a breather")) {
					takeABreather(player);
				} else {
					if (choice.toLowerCase().contains("check") || choice.toLowerCase().contains("inventory")
							|| choice.toLowerCase().contains("checking")
							|| choice.toLowerCase().contentEquals("check your inventory")) {
						checkInventory(player);
					} else {
						if (choice.toLowerCase().contains("shopping") || choice.toLowerCase().contains("shop")
								|| choice.toLowerCase().contentEquals("go shopping")) {
							goShopping(player);
						} else {
							if (choice.toLowerCase().contains("put") || choice.toLowerCase().contains("coffee")
									|| choice.toLowerCase().contentEquals("put the coffee on")) {
								isCoffeeOn = putCoffeeOn();
							} else {
								if (choice.toLowerCase().contains("prep") || choice.toLowerCase().contains("pastries")
										|| choice.toLowerCase().contains("bake")
										|| choice.toLowerCase().contains("pastry")
										|| choice.toLowerCase().contentEquals("prep pastries")) {
									if (player.getInventory().getPastry().getCount() > 0) {
										state.put("Pastries", prepPastries(player));
									} else {
										printer.print("Type in an option and hit \"enter.\"");
									}
								} else {
									if (choice.toLowerCase().contains("more")
											|| choice.toLowerCase().contains("options")
											|| choice.toLowerCase().contains("other")
											|| choice.toLowerCase().contentEquals("more options")) {
										moreOptions(player);
									} else {
										printer.print("Type in an option and hit \"enter.\"");
									}
								}
							}
						}
					}
				}
			}
		}
		return state;
	}
	
	//// 							SETUP METHOD END 							////
	////////////////////////////////////////////////////////////////////////////////
	
	
	
	//////////////////////////////////////////////////////////////
	//				 	METHODS FOR SETUP 						//

	public void moreOptions(Player player) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Other things to do:");
		System.out.println();
		System.out.println("Shop online.");
		System.out.println("Look around.");
		System.out.println("Schedule an event.");
		System.out.println("Start a marketing campaign.");
		System.out.println("Configure your recipes.");
		System.out.println("Go back.");
		System.out.print("-");

		// MEGAINPUT //
		boolean flag = false;
		while (flag == false) {
			String choice = scan.nextLine();
			if (choice.toLowerCase().contains("shop") || choice.toLowerCase().contains("online")
					|| choice.toLowerCase().contains("amazon") || choice.toLowerCase().contentEquals("shop online")) {
				shopOnline(player);
			} else {
				if (choice.toLowerCase().contains("look") || choice.toLowerCase().contains("around")
						|| choice.toLowerCase().contentEquals("look around")) {
					lookAround(player);
				} else {
					if (choice.toLowerCase().contains("start") || choice.toLowerCase().contains("marketing")
							|| choice.toLowerCase().contains("campaign")
							|| choice.toLowerCase().contentEquals("start a marketing campaign")) {
						startMarketingCampaign(player);
					} else {
						if (choice.toLowerCase().contains("configure") || choice.toLowerCase().contains("recipes")
								|| choice.toLowerCase().contentEquals("configure your recipes")) {
							configureRecipes(player);
						} else {
							if (choice.toLowerCase().contains("back")
									|| choice.toLowerCase().contentEquals("go back")) {
								System.out.println();
								System.out.println();
								System.out.println();
								flag = true;
								return;
							} else {
								printer.print("Type in an option and hit \"enter.\"");
								moreOptions(player);
							}
						}
					}
				}
			}
		}
	}

	public boolean prepPastries(Player player) {
		printer.print("You turn on the convection oven, whip on your apron,");
		printer.print("and soon the smell of sweet dough is the only thing on your mind.");
		System.out.println();
		System.out.println();
		System.out.println();
		return true;
	}

	public boolean putCoffeeOn() {
		printer.print("You grind up fresh coffee and fill up a filter.");
		printer.print("You use the pot to fill up the coffeemaker, and");
		printer.print("turn it on. ", "The smell lights up the room, and");
		printer.print("A steady dripping sounds on the surface of the pot.");
		printer.print("You feel genuinely happy with the world for a second.");
		System.out.println();
		System.out.println();
		System.out.println();
		return true;
	}

	public void goShopping(Player player) {
		System.out.println("Unimplemented, type 1 to buy coffee.");
		int choice = scan.nextInt();
		if (choice == 1)	{
			player.getInventory().getCoffee().addToCount(1);
			player.setFunds(player.getFunds() - 1);
		}
		// It doesn't let you go to the market if you've already gone to one, also keep

		// Buy appliances and furniture: appliances, furniture
		// Buy coffee and supplies: spamsclubwholesale, gourmetcoffeesourcing,
		// farmersmarket. wholesales has discount for buying in bulk.
	}

	public void checkInventory(Player player) {
		printer.print("You open the pantry:");
		System.out.println("Coffee: ");
		System.out.print(player.getInventory().getCoffee().getCount());
		if(player.getInventory().getCoffee().getCount() > 10)	{
			System.out.print("      Critically low!");
		}
		// Check your inventory (with alerts for critical states) Note to self: you need
		// more "cups"/coffee etc.
	}

	public void takeABreather(Player player) {
		System.out.println();
		System.out.println();
		System.out.println();
		printer.print("You sit down on one of the the soft chairs by the front window");
		printer.print("and close your eyes, ", "taking a second to reflect before your day.");
		System.out.println();
		
		boolean flag = false;
		while (flag == false) {
		System.out.println("Check your bank balance.");
		System.out.println("Check your Facebook.");
		System.out.println("Look in the mirror.");
		System.out.println("Go back.");
		System.out.print("-");
			String choice = scan.nextLine();
			if (choice.toLowerCase().contains("bank") || choice.toLowerCase().contains("balance")
					|| choice.toLowerCase().contains("money")
					|| choice.toLowerCase().contentEquals("check your bank balance")) {
				checkYourBankBalance(player);
			} else {
				if (choice.toLowerCase().contains("facebook") || choice.toLowerCase().contains("face")
						|| choice.toLowerCase().contentEquals("check your facebook")) {
					checkYourFacebook(player);
				} else {
					if (choice.toLowerCase().contains("start") || choice.toLowerCase().contains("look")
							|| choice.toLowerCase().contains("mirror")
							|| choice.toLowerCase().contentEquals("look in the mirror")) {
						lookInMirror(player);
					} else {
						if (choice.toLowerCase().contains("back") || choice.toLowerCase().contains("go")
								|| choice.toLowerCase().contentEquals("go back")) {
							flag = true;
						} else {
							printer.print("Type in an option and hit \"enter.\"");
						}
					}
				}
			}
		}
	}

	public boolean turnSign(boolean isCoffeeOn) {
		printer.print("You walk through the cafe turning the lights on one by one,");
		// IF HAVE SOUND DO THAT printer.print("");
		printer.print("You turn the sign on the window by the door to \"open\"");
		printer.print("and stand behind the counter, ready for your early crowd.");
		System.out.println();
		System.out.println();
		System.out.println();
		return isCoffeeOn;
	}

	// 															//
	//////////////////////////////////////////////////////////////
	
	
	
	//////////////////////////
	// 	FOR MORE OPTIONS 	//

	public void shopOnline(Player player) {
		// UNIMPLEMENTED
	}

	public void lookAround(Player player) {
		// UNIMPLEMENTED
	}

	public void startMarketingCampaign(Player player) {
		// UNIMPLEMENTED
	}

	public void configureRecipes(Player player) {
		// UNIMPLEMENTED
	}

	// 						//
	//////////////////////////
	
	
	
	/////////////////////////////////////////////////////////////
	//// 				FOR TAKING BREATHER 				 ////

	public void checkYourBankBalance(Player player) {
		System.out.println();
		System.out.println();
		System.out.println();
		printer.print("You feel for the shape of your phone in your right pocket.");
		printer.print("You login to your bank and hope for a big number,");
		printer.print("Checking Balance: ", "$" + numberConversions.numberize(player.getFunds()) + ".");
		printer.lineWait();
		System.out.println();
		return;
	}

	public void checkYourFacebook(Player player) {
		printer.print("You open Facebook and look at your last post,");
		//it says/Depending On Day
		//UNIMPLEMENTED
		printer.print("You see that it has " + player.getLikeability() + " likes.");
	}

	public void lookInMirror(Player player) {
		// You look in the mirror, describing how you feel.
		printer.print("You get up from the chair and walk over to the mirror");
		printer.print("by the door. ", "You wipe a fuzzy off your shirt and");
		printer.print("move your bangs out of your face. You feel " + textConversions.happinessConversion(player.getHappiness()) + " today.");
System.out.println();
System.out.println();
System.out.println();
	}

	//// 													 ////
	/////////////////////////////////////////////////////////////
	
}
