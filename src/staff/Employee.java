package staff;

public  abstract class Employee extends person {
	private int empId;
	protected double basicSalary;
	public Employee(String name, int dd, int yy, int mm,int empId, double basicSalary) {
		super( name,  dd,  mm,  yy);
		this.empId = empId;
		this.basicSalary = basicSalary;
	}
	public Employee() {
		super();
		empId=5;
		basicSalary=5000;
		// TODO Auto-generated constructor stub
	}
	public void   display() {
		super.display();
		System.out.println("Empid of the Employe: "+empId);
		System.out.println("Basic salary of the Employr "+basicSalary);	
	}	
	public abstract double CalcSalary();
}
