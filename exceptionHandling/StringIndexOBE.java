package exceptionHandling;

public class StringIndexOBE {

	public static void main(String[] args) {
		// String index out of bounds exception in runtime
		String s="vimal";
		try {
		System.out.println(s.charAt(5));
	}
		catch(Exception e)
		{
			System.out.println("Exception occured");
		}

	}
}
