package loopingStatement;

public class MultiplesOf7and9 {

	public static void main(String[] args) {
for(int i=1;i<=100;i=i+1)
{
	if(i%7==0)
	{
		if(i%9==0)
		{
			System.out.println(i);
		}
	}
	
	
}

//optimize code 
for(int i=1;i<=100;i=i+1)
{
	if(i%7==0&&i%9==0)
	{
		System.out.println(i);
	}
	
	
	
}



	}

}
