package staff;

public class salesmanager extends Employee {
 private double salesTarget;
 private double perCommision;
  public salesmanager() {
	  salesTarget=1;
	  perCommision=2;
  }
  
  public salesmanager(String name, int dd, int yy, int mm, int empId, double basicSalary, double salesTarget,
		double perCommision) {
	super(name, dd, yy, mm, empId, basicSalary);
	this.salesTarget = salesTarget;
	this.perCommision = perCommision;
}


public void display() {
	super.display();
	  System.out.println("Target to be accived: "+salesTarget);
	  System.out.println("Commision on per : "+perCommision);
  }

@Override
public double CalcSalary() {
	// TODO Auto-generated method stub
	return basicSalary+(salesTarget*perCommision);
}
 
}
