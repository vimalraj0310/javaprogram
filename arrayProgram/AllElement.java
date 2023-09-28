package arrayProgram;

public class AllElement {

	public static void main(String[] args) {
//print all element in an  array:
		int a[]= {1,2,3,4,5,6,7,8};
		double d[]= {2.33,22.11,455.6666,33};
		char c[]= {'v','i','m','a','l'};
		boolean b[]= {true,false};
		
	for(int i=0;i<a.length;i=i+1)
	{
		System.out.print(a[i]);
	}
	System.out.println();
	for(int i=0;i<d.length;i=i+1)
	{
		System.out.print(d[i]);
	}
	System.out.println();

	for(int i=0;i<c.length;i=i+1)
	{
		System.out.print(c[i]);
	}
	System.out.println();

	for(int i=0;i<b.length;i=i+1)
	{
		System.out.println(b[i]);
	}
		
		
	}

}
