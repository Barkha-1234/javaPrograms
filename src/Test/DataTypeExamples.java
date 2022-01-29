package Test;

public class DataTypeExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=20;
		int num2= 30;
		 int sum= num1+num2;
		 int subtraction = num2-num1;
		 int mul= num2*num1;
		 float div= (float) num2/num1; // type casting
		  System.out.println("Addtion of two numbers "+sum);
		  System.out.println("subtraction of two numbers "+subtraction);
		  System.out.println("Multiplication of Two numbers "+mul);
System.out.println("Divison of two numbers " +div);

  String name= "Clean india Green india";
  System.out.println("Total num of char "+ name.length()); // calculate string length
  
  char char1= name.charAt(0);
  System.out.println("Char at first place "+char1); // find out char at specific position
  
  System.out.println("The string in uppercase "+name.toUpperCase()); // convert string into uppercase

  System.out.println("The string in Lowercase "+name.toLowerCase()); // convert string into lowercase
	}

}
