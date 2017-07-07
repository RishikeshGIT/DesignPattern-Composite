package designpatterns.composite;

//this acts as the 'Component'
public interface Employee {
	
	public String getName();
	public String getDesignation();
	
	public long getId();
	public String getSalary();
	
	public void addSubordinates(Employee e);
	public void removeSubordinate(Employee e);
	
	public Employee getChild(int index);
	
	public void displayEmployeeDetails();
}
