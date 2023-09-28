package collection_program;

import java.util.ArrayList;


public class ArrayList_program {

	public static void main(String[] args) {
		//ArrayList Program
		ArrayList<Comparable> ar=new ArrayList<Comparable>();
		ar.add("vimal");
		ar.add(5);
		ar.add(5.90);
		ar.add('v');
		ar.add(true);
	System.out.println(ar.size());	
	System.out.println(ar.indexOf("vimal"));
	System.out.println(ar.isEmpty());
	System.out.println(ar.get(4));
	System.out.println(ar.contains(5));
	System.out.println(ar.set(0,"kiruthika"));
	System.out.println(ar.lastIndexOf('v'));
	System.out.println(ar.remove(1));
	System.out.println(ar);
ar.clear();
	}

}
