package loopingStatement;

public class FindFactors {

	public static void main(String[] args) {
		int i=48;
		for(int j=1;j<=i;j=j+1)
		{
			if(i%j==0)
			{
				System.out.println(j);
			}
		}
	}

}
