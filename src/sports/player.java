package sports;
import staff.person;

public class player extends person {

	private int playerId;
	private double contractFees;
	public player(String name, int dd, int yy, int mm, int playerId, double contractFees) {
		super(name, dd, yy, mm);
		this.playerId = playerId;
		this.contractFees = contractFees;
	}
	
	public void display() {
		super.display();
		System.out.println("PLayer id to be mentioned: "+ playerId);
		System.out.println("Contact Fees : "+ contractFees);
	}
	
}
