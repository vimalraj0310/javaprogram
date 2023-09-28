package exceptionHandling;

public class Arithmetic_exception {

	public static void main(String[] args) {
	
		
		// Arithmetic Exception in runtime
		
		int a=55;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception founded");
		}
	}

}
