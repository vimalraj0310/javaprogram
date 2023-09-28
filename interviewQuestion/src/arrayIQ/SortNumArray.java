package arrayIQ;

public class SortNumArray {

	public static void main(String[] args) {
//sort a numeric array 
		int a[]= {2,4,2,1,7,5,4,3,9,67,90};
		int temp;
		for(int i=0;i<a.length;i=i+1)
		{
			for(int j=i;j<a.length;j=j+1)
			{
				if(a[i]<a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
					
					
					
				}
				
			}
			
			System.out.println(a[i]);

			
			
			
		}
		
		
		
		
	}

}
