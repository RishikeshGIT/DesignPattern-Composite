package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

//this acts as a 'Leaf'
public class Clerk implements Employee {

	String name;
	long id;
	String salary;
	String designation;
	
	public Clerk(String name, int id, String salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		designation = "Clerk";
	}
	
	public long getId(){
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSalary(){
		return this.salary;
	}
	
	public String getDesignation(){
		return this.designation;
	}
	
	List<Employee> subordinates = new ArrayList<>();
	public void addSubordinates(Employee e) {}
	
	public void removeSubordinate(Employee e) {}
	
	public Employee getChild(int index){
		return subordinates.get(index);
	}
	
	public void displayEmployeeDetails() {
		System.out.println("===================================================");
		System.out.println("Name of the Employee:"+this.getName());
		System.out.println("Designation of the Employee:"+this.getDesignation());
		System.out.println("ID of the Employee:"+this.getId());
		System.out.println("Salary of the Employee:"+this.getSalary());
	}
}
