package ooo;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee emp1= new Employee ();
		 emp1.name="sachin";
		 emp1.salary=10000;
		 emp1.employeeId=10;
		 
		 System.out.println("Name of employee 1 "+emp1.name);*/
		
		Employee emp1= new Employee("barkha",10000,10); // constructer calling
		Employee emp2= new Employee("Rahul",101); // constructer calling
		
		emp1.method1();
		emp2.method1();
	}

}
