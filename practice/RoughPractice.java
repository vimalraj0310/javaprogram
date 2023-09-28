package practice;

public class RoughPractice {

	public static void main(String[] args) {
	int a[]= {0,2,4,1,3};
	for(int i=0;i<a.length;i=i+1)
	{
		a[i]=a[a[i+3]%a.length];
		
	}
	
	}

}
