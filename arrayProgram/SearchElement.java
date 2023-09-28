package arrayProgram;

public class SearchElement {

	public static void main(String[] args) {
		// Search an element in an array(using flag logic)
		
		int a[]= {1,2,4,5,6,7,0};
		int srch=5;
		boolean flag=false;
		for(int i=0;i<a.length;i=i+1)
		{
			if(a[i]==srch)
			{
				flag=true;
			}
		}
		System.out.println(flag);

	}

}
