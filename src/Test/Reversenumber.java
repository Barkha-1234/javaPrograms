package Test;

public class Reversenumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num5= 741258;
		int rev1 = 0;
		while(num5>0)
		{
			
			int remindar=num5%10;
			rev1=rev1*10+remindar;
			num5=num5/10;
		}
		System.out.println("The reversed value is  "+ rev1);
	}
	
	}

