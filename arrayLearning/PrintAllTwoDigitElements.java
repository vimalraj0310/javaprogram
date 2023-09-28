package arrayLearning;

public class PrintAllTwoDigitElements {

	public static void main(String[] args) {
int a[]= {2,4,5,2,33,44,55,2,4,4,890,800,66,44,90};
for(int i=0;i<a.length;i=i+1)	
	{
	if(a[i] > 9 && a[i] < 100)
	{
		System.out.print(a[i]+" ");
	}
	}
	}

}
