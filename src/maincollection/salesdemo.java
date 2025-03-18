package maincollection;
 import staff.Administator;
 import staff.programmer;
 import staff.salesmanager;
public class salesdemo {

	public static void main(String[] args) {
		salesmanager s1=new salesmanager("test",10,12,2001, 53, 050000, 200, 050);
		s1.display();
		 programmer p1=new programmer("test",10,12,2001, 53, 050000, "Java", 15, 300);
		 p1.display();
		 Administator ad1=new Administator("Suyog",10,12,2001, 53, 050000, 5000);
	     ad1.display();
	}
}
