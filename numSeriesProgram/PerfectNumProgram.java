package numSeriesProgram;

public class PerfectNumProgram {

	public static void main(String[] args) {
		for(int number=1;number<=1000;number=number+1)
		{
		//int number=6;
		int sum=0;
		for(int i=1;i<=number/2;i=i+1)
		{
		if(number%i==0)
		{
		sum=sum+i;
		//System.out.println(i);
		}
		}

		//System.out.println(sum);
		if(number==sum)
		{
		System.out.println("perfect Number "+number);

		}
		//else
		//{
		//System.out.println("Not a Perfect Number");
		//}
		}
	}

}
