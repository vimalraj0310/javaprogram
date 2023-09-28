package collectionProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(304);
		al.add(185);
		al.add(21);
		al.add(1998);
		al.add(1);
		al.add(16);
		al.add(333);
		//before sort
		System.out.println(al);
		
		Collections.sort(al);
		//After sort
		System.out.println(al);
		
		
	}

}
