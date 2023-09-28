package loopingStatement;

public class FIndandSumoffactors {
public static void main(String args[])
{
int num=48;
int sum=1;
for(int i=1;i<=num;i=i+1)
{
if(num%i==0)
{
	System.out.println(i);
	sum=sum+i;
	
}

	
}
System.out.println("Sum of all factors in 48   "+sum);	
	
	
}	
}
