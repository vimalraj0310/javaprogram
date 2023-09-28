package practiceMethod;

public class FindSmallest {

	int smallestNumber()
	{
		int a=7,b=1,c=2;
		int x=(a<b?a:b);
		int y=(x<c?x:c);
		System.out.println(y);
		return y;
		
	}
	public static void main(String[] args) {
FindSmallest FS=new FindSmallest();
FS.smallestNumber();
		
		
	}

}
