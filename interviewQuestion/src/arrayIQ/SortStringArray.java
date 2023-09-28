package arrayIQ;

public class SortStringArray {
//sort String array 
	public static void main(String[] args) {
String a[]= {"vimal","teven","kiruthika","karthika"};
for(int i=0;i<a.length;i=i+1)
{
	for(int j=i;j<a.length;j=j+1)
	{
		if(a[i].compareToIgnoreCase(a[j])>0)
			
		{
			String temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
					
		
		
	}
	
	System.out.println(a[i]);

}

		
		
		
		
	}

}
