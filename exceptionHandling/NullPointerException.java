package exceptionHandling;

public class NullPointerException {

	

	public static void main(String[] args) {
		String s = null;
		try {
		System.out.println(s.charAt(3));
		}
		catch(Exception e)
		{
			System.out.println("exception occured");
		}
	}

}
