package this_And_Super_KeyWord;

public class Child extends Parent{ 
	
	int d=20;
	int a=20;
	
	
int sub(int a,int b)
{
	int c=a-b;
	System.out.println(c);
return c;

}

int divide(int a)
{
	int e=a/this.d;
	System.out.println(e);
	return e;
}
void m()
{
	int a=3;
	System.out.println(a+super.a+this.a);
	
	
}

}
