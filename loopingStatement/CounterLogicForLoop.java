package loopingStatement;

public class CounterLogicForLoop {

	public static void main(String[] args) {
int counter=0;
int number=6;
for(int i=2;i<=number/2;i=i+1)
{
	if(number%i==0)
	{
		counter=counter+1;
		
	}
}
System.out.println(counter);
	}

}
