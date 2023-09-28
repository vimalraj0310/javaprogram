package arrayLearning;

public class SearchAnElement {

	public static void main(String[] args) {
int a[]= {1,4,3,5,6,7,8,9,2,8};
boolean flag=false;
for(int i=0;i<a.length;i=i+1)
{
	if(a[i]==3)
	{
		flag=true;
		
	}

}
System.out.println(flag);
	}

}
