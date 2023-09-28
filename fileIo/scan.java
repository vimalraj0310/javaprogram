package fileIo;

import java.util.Scanner;

public class scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter your a value:");
		double a=sc.nextDouble();
		System.out.print("enter your b value:");
		int b=sc.nextInt();
	sc.close();
System.out.println(a+b);
	}

}
