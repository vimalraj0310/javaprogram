package arrayProgram;

public class TwoDigitElement {

	public static void main(String[] args) {
		// print all 2 digit element in an array?
		
		int a[]= {1,3,44,55,2,11,22,9,88,99,555,444,33,4466,7789,88,11};
		for(int i=0;i<a.length;i=i+1)
		{
			if(a[i]>9&&a[i]<100)
			{
				System.out.println(a[i]);
			}
			
			
			
		}
			

	}

}
