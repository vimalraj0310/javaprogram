package patternProgram;

public class DiamondPattern {

	public static void main(String[] args) {
		int  m=5;
		int i=1;
		for(i=1;i<=m;i=i+1)
		{

		for(int j=i;j<=m;j=j+1)
		{
		System.out.print(" ");
		}
		for(int k=1;k<=i;k=k+1)
		{
		System.out.print(" *");
		}
		System.out.println();

		}
		for(int k=1;k<=m;k=k+1)
		{
		System.out.print(" ");
		}
		for(int j=i;j<=m;j=j+1)
		{
		System.out.print(" *");
		}
		System.out.println();
	}

}
