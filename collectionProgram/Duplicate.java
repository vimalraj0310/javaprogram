package collectionProgram;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Duplicate {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(304);
		al.add(185);
		al.add(21);
		al.add(1998);
		al.add(1);
		al.add(16);
		al.add(333);
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.addAll(al);
		System.out.println(lhs);
		
	}

}
