package arrayProgram;

public class Odd_Even_Element {

	public static void main(String[] args) {
		// To Count No Of Odd And Even Numbers in an array?
		int a[]= {1,2,4,5,6,7,8,9,22,3334,55,6,3};
		int countEven=0,countOdd=0;
		for(int i=0;i<a.length;i=i+1)
		{
			if(a[i]%2==0)
			{
			countEven=countEven+1;

			}
			else
			{
				
				countOdd=countOdd+1;
			}
			
			
		}
		
		System.out.println("even number in given array: "+countEven);
		System.out.println("Odd number in given array: "+countOdd);

		

	}

}
