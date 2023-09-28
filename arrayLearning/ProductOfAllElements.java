package arrayLearning;

public class ProductOfAllElements {

	public static void main(String[] args) {
		int a[]= {16,28,82,48,9,22,13,58};
		int product=1;
		for(int i=0;i<a.length;i=i+1)
		{
			product=product*a[i];
			
		}
		System.out.println(product);
	}

}
