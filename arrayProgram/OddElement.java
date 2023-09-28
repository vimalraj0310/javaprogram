package arrayProgram;

public class OddElement {

	public static void main(String[] args) {
//print all odd element in an array?
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i=i+1)
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]);
			}
		}
		
		
	}

}
