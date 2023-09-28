package arrayProgram;

public class SumAllElement {

	public static void main(String[] args) {
// Print sum of all element in an array?
		int a[]= {122,33,44,53,12,44,66,89};
		int sum=0;
		for(int i=0;i<a.length;i=i+1)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
	}

}
