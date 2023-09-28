package arrayProgram;

public class MulitipleOf7and9 {

	public static void main(String[] args) {
		// print element which are multiple of 7and 9 in an array?
		int a[]= {12,33,44,53,21,63,88,95,23,91};
		for(int i=0;i<a.length;i=i+1)
		{
			if(a[i]%7==0&&a[i]%9==0)
			{
				System.out.println(a[i]);
			}
			
			
		}
		// print element which are multiple of 7 and 9 seperately?
		
		int b[]={12,33,44,53,21,63,88,95,23,91,9,18};
		for(int i=0;i<b.length;i=i+1)
		{

			if(b[i]%7==0)
			{
				System.out.println("multiple of 7: "+b[i]);
			}
			if(b[i]%9==0)
			{
				System.out.println("multiple of 9:  "+b[i]);
			}
			
		}
		
		
		

	}

}
