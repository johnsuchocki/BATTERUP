package atBats;

import java.util.Scanner;

public class BattingAvgSlugCalc {

	static Scanner userInput = new Scanner(System.in);
	int numBatters = 1;
	
	public static void main(String[] args) {
		
		System.out.println("How many batters' stats do you need to calculate?");
		String numOfBatters = userInput.nextLine();
		int numBatters = Integer.parseInt(numOfBatters);
		
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
				batterHits[i] = Integer.parseInt(currentBat);
			}
		
			Batters batter = new Batters(playerName, atBats, batterHits);
			System.out.print(playerName + "\'s batting average is ");
			System.out.printf("%.3f", batter.getBatAvg());
			System.out.println("");
			System.out.print(playerName + "\'s slugging percentage is ");
			System.out.printf("%.3f", batter.getSlugPerc());
			System.out.println("");
		}	
	}
}

