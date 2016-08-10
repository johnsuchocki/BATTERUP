package atBats;

import java.util.Scanner;

public class BattingAvgSlugCalc {

	static Scanner userInput = new Scanner(System.in);
	int numBatters = 1;
	
	public static void main(String[] args) {
		
		System.out.println("How many batters' stats do you need to calculate?");
		String numOfBatters = userInput.nextLine();
		int numBatters = Integer.parseInt(numOfBatters);
		
		Batters[] batterData = new Batters[numBatters];
		
		for (int j = 0; j < numBatters; j++) {
	
			System.out.println("What is the name of batter #" + (j + 1) + "?");
			String playerName = userInput.nextLine();
		
			System.out.println("How many at bats did the batter have?");
			String numAtBats = userInput.nextLine();
			int atBats = Integer.parseInt(numAtBats);
		
			System.out.println("Please enter 0 for a strike out,");
			System.out.println("1 for a single, 2 for a double,");
			System.out.println("3 for a triple, or 4 for a home run.");
		
			int[] batterHits = new int[atBats];
			for (int i = 0; i < atBats; i++) {
				System.out.println("What happened during at bat # " + (i + 1) + "?");
				String currentBat = userInput.nextLine();
				
				//Validates user entry for hit types
				//if user entry is correct, the value is plugged into the array
				int hitValidCheck = Integer.parseInt(currentBat);
				if ((hitValidCheck == 0) || (hitValidCheck == 1) || (hitValidCheck == 2) || 
						(hitValidCheck == 3) || (hitValidCheck == 4)) {
					batterHits[i] = hitValidCheck;
				} else {
				//if user entry is incorrect, this iteration of the loop is repeated
				//until the user entry is correct
					System.out.println("That entry is invalid");
					i--;
				}	
			}
		
			Batters batter = new Batters(playerName, atBats, batterHits);
			batterData[j] = batter;
			
			System.out.print(playerName + "\'s batting average is ");
			System.out.printf("%.3f", batter.getBatAvg());
			System.out.println("");
			System.out.print(playerName + "\'s slugging percentage is ");
			System.out.printf("%.3f", batter.getSlugPerc());
			System.out.println("");
		}	
	}
}

