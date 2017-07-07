package designpatterns.composite;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

//this acts as the 'Composite'
public class BankManager implements Employee{
	String name;
	long id;
	String salary;
	String designation;
	
	public BankManager(String name, long id, String salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		designation = "Manager";
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
	
	List<Employee> subordinates = new ArrayList<Employee>();
	
	public void addSubordinates(Employee e) {
		subordinates.add(e);
	}
	
	public void removeSubordinate(Employee e) {
		subordinates.remove(e);
	}
	
	public Employee getChild(int index){
		return subordinates.get(index);
	}
	
	public void displayEmployeeDetails() {
		Iterator<Employee> emp = subordinates.iterator();
		
		printDetails();
		
		while(emp.hasNext())
			printDetails(emp.next());
	}
	
	private void printDetails() {
		System.out.println("===================================================");
		System.out.println("Name of the Employee:"+this.getName());
		System.out.println("Designation of the Employee:"+this.getDesignation());
		System.out.println("ID of the Employee:"+this.getId());
		System.out.println("Salary of the Employee:"+this.getSalary());
	}
	
	private void printDetails(Employee e) {
		System.out.println("===================================================");
		System.out.println("Name of the Employee:"+e.getName());
		System.out.println("Designation of the Employee:"+e.getDesignation());
		System.out.println("ID of the Employee:"+e.getId());
		System.out.println("Salary of the Employee:"+e.getSalary());
	}
}
