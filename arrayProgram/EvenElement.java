package arrayProgram;

public class EvenElement {

	public static void main(String[] args) {
		// print all even element in an given array
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<a.length;i=i+1)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
