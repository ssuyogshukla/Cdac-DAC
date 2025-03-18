package sports;

public class footballplayer extends player {
 private int totalGoalScore;

public footballplayer(String name, int dd, int yy, int mm, int playerId, double contractFees, int totalGoalScore) {
	super(name, dd, yy, mm, playerId, contractFees);
	this.totalGoalScore = totalGoalScore;
}
 public void display() {
	 super.display();
	 System.out.println("Goal score by player : "+totalGoalScore);
 }
 
}
