package loopingStatement;

public class FlagLogicForLoop {

	public static void main(String[] args) {
boolean flag=false;
int number=9;
for(int i=2;i<=number/2;i=i+1)
{
	if(number%i==0)
	{
		flag=true;
		
	}
}
System.out.println(flag);
	}

}
