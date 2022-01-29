package Test;

import java.util.Scanner;

public class ConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your age:");
int age=scanner.nextInt();
if (age>=18)
{
	System.out.println("you are eligiable for voting");
}
else if (age==17)
{
	System.out.println("you are not eligiable for voting this year, try next time");
	
}
else
{
	int eligibleYear = 18 -age;
	System.out.println("you are not eligible for voting this year, try after" + eligibleYear);

}
scanner.close();
	}

}
