package stringHomeWork;

import java.util.Scanner;

public class RemoveParticular {

	public static void main(String[] args) {
try (Scanner in = new Scanner(System.in)) {
	System.out.println("enter String:");
	String s=in.nextLine();
	char c[]=new char[s.length()];
	for(int i=0;i<c.length;i=i+1)
	{
			c[i]=s.charAt(i);
	}
	//System.out.println("enter particular char For remove:");
	//char d=in.next().charAt(0);
	System.out.println("Enter index you want to remove:");
	int m=in.nextInt();
	for(int i=0;i<c.length;i=i+1)
	{
		if(c[i]==c[m])
		{
			c[i]=' ';
			
		}
		
		
	}
	System.out.println(c);
}
	}

}
