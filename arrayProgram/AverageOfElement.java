package arrayProgram;

public class AverageOfElement {

	public static void main(String[] args) {
		// Average of elements in an array
		
		int a[]= {12,33,44,55,33,22};
		int sum=0,avg=0;
		for(int i=0;i<a.length;i=i+1)
		{
			sum=sum+a[i];
			
		}
		avg=sum/a.length;
		System.out.println(avg);
		

	}

}
