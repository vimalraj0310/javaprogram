package loopingStatement;

public class MultiplesOf2 {

	public static void main(String[] args) {
		// multiples of 2 using filter
		for(int i=1;i<100;i=i+1) {
			if(i%2==0)
			{
				System.out.println(i);
			}
			
		}
		//optimize code
		
		for(int i=2;i<=100;i=i+2)
		{
			System.out.println(i);
		}

	}

}
