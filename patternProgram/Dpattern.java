package patternProgram;

public class Dpattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i=i+1)
		{
		for(int j=1;j<=5;j=j+1)
		{
		if(i==1||i==5||j==2||j==5)
		{
		System.out.print("*");
		}
		else
		{
		System.out.print(" ");
		}
		}
		System.out.println();
		}
	}

}
