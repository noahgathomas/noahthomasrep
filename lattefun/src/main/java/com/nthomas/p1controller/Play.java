package com.nthomas.p1controller;

import com.nthomas.p1operations.ClosingOperations;
import com.nthomas.p1operations.MorningOperations;
import com.nthomas.p1operations.OpenOperations;
import com.nthomas.p8events.DailyIntro;
import com.nthomas.p8events.Introduction;
import com.nthomas.p9p2conversions.TextConversions;

public class Play {

	// Customizable variables
	private static int gameLength = 21;
	private static int startingDay = 1;

	// MAIN
	public static void main(String[] args) {

		// Object Instances //
		Play gameInstance = new Play();
		Introduction introductionInstance = new Introduction();
		//////////////////////

		//// The full game start /////////////////////////////////////////////////
		// intro //
		Player player = new Player(introductionInstance.introductionText()); //
		// start day iterator //
		gameInstance.dayIterator(startingDay, player); //
		// credits //
		System.out.println("The end."); //
		//// The full game end ///////////////////////////////////////////////////
	}

	public void dayIterator(int thisDay, Player player) {
		
		// Helper Class Instances //
		MorningOperations morningOperations = new MorningOperations();
		OpenOperations openOperations = new OpenOperations();
		ClosingOperations closingOperations = new ClosingOperations();
		DailyIntro dailyIntro = new DailyIntro();
		TextConversions textConversions = new TextConversions();
		////////////////////////////
		
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////THE DAY START
		System.out.println(textConversions.dayOfWeek(thisDay) + ", Day " + thisDay + ", " + player.getName() + ":");
		dailyIntro.dailyIntro(thisDay, player);

		morningOperations.setUp(thisDay, player);
		// Before the day starts, you have access to the menu to stock up, bake, and
		// turn coffee on.

		openOperations.customerInteractions(thisDay, player);
		// Generate customer interactions randomly with new instances of customers,
		// using their preferences.

		openOperations.daysEvent(thisDay, player);
		// Any events happen here

		closingOperations.cleanUp(thisDay, player);
		// there's cleanup, you have to go through and clean up the individual parts, if
		// you do not clean them up, sadness occurs.

		closingOperations.summaries(thisDay, player);
		// FINANCIAL SUMMARY, RATING SUMMARY, ANY ANNOUNCMENTS FOR THE NEXT DAY (Mostly
		// none)

		// WEEKLY RENT
		if (thisDay % 7 == 0) {
			System.out.println("ENTER RENT SEQUENCE HERE");
		}

		if (thisDay < gameLength) {
			dayIterator(thisDay + 1, player);
		} else {
			return;
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////THE DAY END

}
