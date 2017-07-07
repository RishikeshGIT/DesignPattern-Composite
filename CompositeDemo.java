package designpatterns.composite;

//this acts as the 'client'
public class CompositeDemo {
	
	public static void main(String[] args) {
		Employee clerk1 = new Clerk("Clerk1", 121, "23,000 INR");
		Employee clerk2 = new Clerk("Clerk2", 212, "28,000 INR");
		Employee accountant = new Accountant("Accountant", 321, "43,000 INR");
		Employee manager = new BankManager("Manager", 401, "63,000 INR");
		
		manager.addSubordinates(clerk1);
		manager.addSubordinates(clerk2);
		manager.addSubordinates(accountant);
		
		manager.displayEmployeeDetails();
	}
}
