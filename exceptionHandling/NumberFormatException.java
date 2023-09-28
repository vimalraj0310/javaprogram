package exceptionHandling;

public class NumberFormatException {

	public static void main(String[] args) {
		// Number format Exception
		String s="100s";
		try {
		Integer i=Integer.parseInt(s);
	
		System.out.println(s+10);
		System.out.println(i+10);
	}
		catch(Exception e)
		{
			
			System.out.println("exception Occured");
		}
	}
	

}
