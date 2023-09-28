package arrayProgram;

public class ProductAllElement {

	public static void main(String[] args) {
		// product of all element in an array?
		int a[]= {12,3,4,3,12,4,6,9};
int product=1;
for(int i=0;i<a.length;i=i+1)
{
	product=product*a[i];
	
}

System.out.println(product);
	}

}
