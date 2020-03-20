package com.nthomas.p9p2conversions;

public class TextConversions {

	public String nameify(String nameInput) {

		if (nameInput.contains(" ")) {
			nameInput = nameInput.trim();
			nameInput = nameInput.replaceAll("( )+", " ");
			String parsedName = "";
			char[] charArray = nameInput.toLowerCase().toCharArray();
			String name = new String(charArray);
			String[] splitName = name.split(" ");
			int i;
			for (i = 0; i < splitName.length; i++) {
				char[] splitCharArray = splitName[i].toLowerCase().toCharArray();
				splitCharArray[0] = Character.toUpperCase(splitCharArray[0]);
				String namePart = new String(splitCharArray);
				if (i > 0) {
					parsedName += " ";
				}
				parsedName += namePart;
			}
			return parsedName;
		} else {
			char[] charArray = nameInput.toLowerCase().toCharArray();
			charArray[0] = Character.toUpperCase(charArray[0]);
			String name = new String(charArray);
			return name;
		}
	}

	public String dayOfWeek(int thisDay) {
		while (thisDay > 7) {
			thisDay -= 7;
		}
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		return days[thisDay - 1];
	}

	public String likeabilityConversion(int likeability) {
		switch (likeability) {
		case 1:
			return "absolutely hated, not in the least bit";
		case 2:
			return "not at all";
		case 3:
			return "not";
		case 4:
			return "not too";
		case 5:
			return "pretty";
		case 6:
			return "quite";
		case 7:
			return "very";
		case 8:
			return "super";
		case 9:
			return "extremely";
		case 10:
			return "ridiculously";
		default:
			if (likeability > 10) {
				return "super duper";
			} else {
				if (likeability < 1) {
					return "despised, viewed as scum: the least";
				} else {
					return "uncertainly";
				}
			}
		}

	}

	public String happinessConversion(int happiness) {
		switch (happiness) {
		case 1:
			return "suicidal";
		case 2:
			return "depressed";
		case 3:
			return "sad";
		case 4:
			return "alright";
		case 5:
			return "hopeful";
		case 6:
			return "content";
		case 7:
			return "happy";
		case 8:
			return "very happy";
		case 9:
			return "exhilarated";
		case 10:
			return "like you're living the dream";
		default:
			if (happiness > 10) {
				return "so elated you can't even";
			} else {
				if (happiness < 1) {
					return "one with the abyss";
				} else {
					return "uncertain";
				}
			}
		}
	}

}
