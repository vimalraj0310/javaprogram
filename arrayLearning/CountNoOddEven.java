package arrayLearning;

public class CountNoOddEven {

	public static void main(String[] args) {
int a[]= {2,3,4,5,62,2,1,2,33,44,55,66,22,12,90,7,8,5,4};
int countOddNumber=0;
int countEvenNumber=0;
for(int i=0;i<a.length;i=i+1)
{
	if(a[i]%2==0)
	{
		countOddNumber=countOddNumber+1;
		System.out.print(a[i]+" ");
	}
	if(a[i]%2==1)
	{
		countEvenNumber=countEvenNumber+1;
	}
}
System.out.println(countOddNumber);
System.out.println(countEvenNumber);

	}

}
