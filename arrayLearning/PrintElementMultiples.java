package arrayLearning;

public class PrintElementMultiples {

	public static void main(String[] args) {
int a[]= {35,5454,667,33,3221,335,667,889,999,332,444};
int b=7;
for(int i=0;i<a.length;i=i+1)
{
	if(a[i]%b==0)
	{
		System.out.println(a[i]);
	}
}
	}

}
