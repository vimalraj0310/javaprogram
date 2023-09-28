package arrayLearning;

public class PrintOccuuranceOfElements {

	public static void main(String[] args) {
int a[]= {5,3,5,4,2,4,5,6,7,8,9,5,9};
int count=0;
for(int i=0;i<a.length;i=i+1)
{
	if(a[i]==5)
	{
		count=count+1;
				}
}
System.out.println(count);
	}

}
