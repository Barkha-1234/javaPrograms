package ooo;

public class Employee 
{

String name;
int employeeId;
int salary;

public Employee(String p1, int p2, int p3)
{
	this.name=p1;
	this.employeeId=p2;
	this.salary=p3;
	
}

public Employee(String p1, int p2)
{
	this.name=p1;
	this.employeeId=p2;
	
	
}
public void method1()
{
	System.out.println("employee name "+ name);

	System.out.println("employee Salary "+ salary);

	System.out.println("employee ID "+ employeeId);
}
}
