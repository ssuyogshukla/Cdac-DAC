package staff;

public class Administator extends Employee {
 private double allowance;
 
 public Administator() {
	 allowance=11;
 }

public Administator(String name, int dd, int yy, int mm, int empId, double basicSalary, double allowance) {
	super(name, dd, yy, mm, empId, basicSalary);
	this.allowance = allowance;
}
 public void display() {
	 super.display();
	 
	 System.out.println("allowance: "+allowance);
 }

@Override
public double CalcSalary() {
	// TODO Auto-generated method stub
	return basicSalary+allowance;
}
}
