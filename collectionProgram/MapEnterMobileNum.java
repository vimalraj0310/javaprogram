package collectionProgram;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MapEnterMobileNum {

	public static void main(String[] args) {
		LinkedHashMap<Long,String> lhm = new LinkedHashMap<Long,String>();
		Scanner sc = new Scanner(System.in);
		String name = "";
		Long num = 0L;
		while (!name.equalsIgnoreCase("quit")) {
		
			System.out.println("enter your name:");
			name = sc.next();

			if (!name.equalsIgnoreCase("quit")) {
				System.out.println("enter your number:");
			num = sc.nextLong();
			lhm.put(num,name);

			}


		}
	
		System.out.println(lhm);
		sc.close();
	}

}
