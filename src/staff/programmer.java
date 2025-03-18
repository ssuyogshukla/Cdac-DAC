package staff;

public class programmer extends Employee {
	 private String projectTitle;
	 private int extrahour;
	 private double chargesperHour;
	 public programmer() {
		 projectTitle="AVB";
		 extrahour=4;
		 chargesperHour=20;
	 }
	public programmer(String name, int dd, int yy, int mm, int empId, double basicSalary, String projectTitle,
			int extrahour, double chargesperHour) {
		super(name, dd, yy, mm, empId, basicSalary);
		this.projectTitle = projectTitle;
		this.extrahour = extrahour;
		this.chargesperHour = chargesperHour;
	}
	 public void display() {
		 super.display();
		 System.out.println("Project Title name :"+projectTitle);
		 System.out.println("extahour job : "+extrahour);
		 System.out.println("charge perextraHour: "+chargesperHour);
	 }
	@Override
	public double CalcSalary() {
		// TODO Auto-generated method stub
		return basicSalary+(extrahour*chargesperHour);
	} 
}
