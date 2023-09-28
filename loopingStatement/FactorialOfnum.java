package loopingStatement;

public class FactorialOfnum {

	public static void main(String[] args) {
//5!=5*4*3*2*1
		int n=5;
		int prod=1;
		for(int i=1;i<=n;i=i+1)
		{
			prod=prod*i;
			
			
		}
		System.out.println(prod);
		
	}

}
