package this_And_Super_KeyWord;

public class Parent {
	int a=10;
	int add(int b)
	{
		// this keyword can be used with non static methods and constructor
		int c=this.a+b;
		System.out.println(c);
		return c;
	}

}
