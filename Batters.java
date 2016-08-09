package atBats;

public class Batters {

	public String playerName = "null";
	public int atBats = 0;
	public int[] batterHits = new int[atBats];
	private int totalHits = 0;
	private int totalBases = 0;
	private double batAvg = 0;
	private double slugPerc = 0;
	
	// batters takes 3 user provided parameters and contains a variety of additional info
	public Batters(String playerName, int atBats, int[] batterHits) {
		this.playerName = playerName;
		this.atBats = atBats;
		this.batterHits = batterHits;
		
		// calculates totalBases
		for(int i = 0; i < atBats; i++) {
			this.totalBases += batterHits[i];
		}

		// calculate totalHits
		for(int j = 0; j < atBats; j++) {
			if (batterHits[j] > 0) {
				this.totalHits++;
			}
		}
		
		// calculates batting average and slugging percentage
		this.batAvg = calcBatAvg(totalHits, atBats);
		this.slugPerc = calcSlugPerc(totalBases, atBats);
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getAtBats() {
		return atBats;
	}

	public void setAtBats(int atBats) {
		this.atBats = atBats;
	}

	public int[] getBatterHits() {
		return batterHits;
	}

	public void setBatterHits(int[] batterHits) {
		this.batterHits = batterHits;
	}

	public int getTotalHits() {
		return totalHits;
	}

	public void setTotalHits(int totalHits) {
		this.totalHits = totalHits;
	}

	public int getTotalBases() {
		return totalBases;
	}

	public void setTotalBases(int totalBases) {
		this.totalBases = totalBases;
	}

	public double getBatAvg() {
		return batAvg;
	}

	public void setBatAvg(double batAvg) {
		this.batAvg = batAvg;
	}

	public double getSlugPerc() {
		return slugPerc;
	}

	public void setSlugPerc(double slugPerc) {
		this.slugPerc = slugPerc;
	}

	public double calcBatAvg (int totalHits, int atBats) {
		double batAvg = (double) totalHits / atBats;
		return batAvg;
	}

	public double calcSlugPerc (int totalBases, int atBats) {
		double slugPerc = (double) totalBases / atBats;
		return slugPerc;
	}
}
