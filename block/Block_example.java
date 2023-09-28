package block;

public class Block_example {
	int a;
	int b;
	
	Block_example(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int a()
	{
		
		int c=a+b;
		System.out.println(c);
		return c;
	}
	static int b()
	{
		int a=10;
		int b=10;
		int c=a+b;
	System.out.println(c);
	return c;
	}
	{
		System.out.println("hi");
	}
	void v()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Block_example be=new Block_example(10,5);
	
	b();
	be.v();
	be.a();

	}

}
