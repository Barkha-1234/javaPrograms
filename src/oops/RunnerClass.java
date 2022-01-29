package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee emp1 = new Employee();
		
		emp1.Name = "Sachin";
		emp1.EmployeeId = 242423;
		emp1.Salary = 1000;
		
		Employee emp2 = new Employee();
		
		emp2.Name = "Mahesh";
		emp2.EmployeeId = 543456;
		emp2.Salary = 1200; */
		
		//Employee emp1 = new Employee("Sachin",242423,1000);
		//Employee emp2 = new Employee("Mahesh",543456,1200);
		
		//emp1.PrintName();
		//emp2.PrintName();

		@SuppressWarnings("unused")
		Employee emp3 = new Employee("Rahul",456785);
		
		Employee.ChangeCompanyName();
		
		MethodOverloadingExample obj=new MethodOverloadingExample();//MethodOverloading class object
		obj.sum(50, 20);
		obj.sum(0, 856, 50);
		
		Encapsulation obj1=new Encapsulation(); //encapsulation class object
		obj1.setCompany("Accenture");
		System.out.println(obj1.getCompany());
	}

}

