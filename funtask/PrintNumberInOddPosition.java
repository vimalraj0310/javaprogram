package funtask;

public class PrintNumberInOddPosition {

	public static void main(String[] args) {
int a=917670828 ;
int b=0;
while(a!=0)
{
	b=a%10;
	if(b%2==1)
	{
		System.out.println("the given integer odd number :"+b);
	}else
	{
		System.out.println("the given integer even number :"+b);
	}
	a=a/10;

}
	}

}
