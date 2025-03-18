package staff;
import basic.Date;
public class person {
	private String name;
	private Date bdate;
	public person(String name, int dd, int yy, int mm) {
		super();
		this.name = name;
		this.bdate=new Date(dd,yy,mm);
	}
	public person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		bdate.display();
		System.out.println("Name of the person: "+name);
		//System.out.println("Date:"+bdate);
	}
	
	
	
}
