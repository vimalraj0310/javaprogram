package arrayProgram;

public class Min_Max_element {

	public static void main(String[] args) {
		// find minimum and maximum element in an array?
		int a[]= {22,3232,232,22,1,444,22,444};
		int min=a[0];
		int max=a[0];
		for(int i=1;i<a.length;i=i+1)
		{
			if(a[i]<min)
			{
				min=a[i];
				
			}
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println(min+"   "+max);
		

	}

}
