package basic;

public class Date {
	private int dd;
	private int mm;
	private int yy;
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public Date() {
		super();
		dd=0;
		mm=0;
		yy=0;
		// TODO Auto-generated constructor stub
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
	public void display() {
	 System.out.println("Date of the work"+dd+"/"+mm+"/"+yy);
	}
	
}
