package arrayLearning;

public class PrintAllOddElement {

	public static void main(String[] args) {
int a[]= {1,3,5,3,3,2,2,2,1,3,4,6,7,8,9,0,999};
for(int i=0;i<a.length;i=i+1)
{
	if(a[i]%2==1)
	{
		System.out.print(a[i]+" ");
	}
	
}
	}

}
