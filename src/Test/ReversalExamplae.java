package Test;

public class ReversalExamplae {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str1="Clean india and Green India";
		String revStr1="";
		for(int index=str1.length()-1;index>=0;index--)
		{
			revStr1=revStr1 + str1.charAt(index);
		}
System.out.println("Reversed string: " + revStr1);
	}
// reversal of number
	
}

