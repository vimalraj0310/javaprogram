package arrayProgram;

public class OccuranceOfElement {

	public static void main(String[] args) {
		// print Occurrence of Element 5 in an array?
		
		int a[]= {3,4,5,6,2,3,5,5,6,9,0,5};
		int srch=5;
		int count=0;
		for(int i=0;i<a.length;i=i+1)
		{
			if(a[i]==srch)
			{
				count=count+1;
			}
			
		}

		
		System.out.println("occurrence  of 5 in given array: "+count);
	}

}
