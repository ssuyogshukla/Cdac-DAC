package sports;

public class cricplayer extends player {
	private int TotalrunScore;
	private int Totalwickettaken;
	public cricplayer(String name, int dd, int yy, int mm, int playerId, double contractFees, int totalrunScore,
			int totalwickettaken) {
		super(name, dd, yy, mm, playerId, contractFees);
		TotalrunScore = totalrunScore;
		Totalwickettaken = totalwickettaken;
	}
	public cricplayer(String name, int dd, int yy, int mm, int playerId, double contractFees) {
		super(name, dd, yy, mm, playerId, contractFees);
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		super.display();
		System.out.println("Total run score by the batsman: " +TotalrunScore);
		System.out.println("Total wicket taken: "+Totalwickettaken);
		
	}
}
