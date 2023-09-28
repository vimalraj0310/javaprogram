package funtask;

public class CountNumberOfDigit {

	public static void main(String[] args) {
int a=7;
int count=0;
while(a>0)
{
	a=a/10;
	count++;
}
System.out.println(count);

	}

}
