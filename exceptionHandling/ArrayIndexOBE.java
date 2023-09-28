package exceptionHandling;

public class ArrayIndexOBE {

	public static void main(String[] args) {
		// Array index Out of Bound Exception in runtime
		int a[]= {1,2,3};
		try {
		System.out.println(a[3]);
		}
		catch(Exception c)
		{
			System.out.println("exception founded");
		}
	}

}
