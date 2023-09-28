package loopingStatement;

public class SquareSum {

	public static void main(String[] args) {
		
		//5power 2
int  base=5;
int power=2;
int ans=1;
for(int i=1;i<=power;i=i+1)
{
	ans=base*ans;
	
}
System.out.println(ans);
	
// 2 power 5
	int pow=5;
	int Base=2;
	int answer=1;
	for(int i=1;i<=pow;i=i+1)
	{
		answer=Base*answer;
	}
	System.out.println(answer);
	
	// using math.sqrt and math.pow methods
	System.out.println(Math.pow(5, 5));
	System.out.println(Math.sqrt(16));
	
	}
}
