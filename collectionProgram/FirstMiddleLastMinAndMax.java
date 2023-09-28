package collectionProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class FirstMiddleLastMinAndMax {

	public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(304);
al.add(185);
al.add(21);
al.add(1998);
al.add(1);
al.add(16);
al.add(333);
//first element in a list

System.out.println(al.get(0));

//Last element in a list

System.out.println(al.get(al.size()-1));

//Middle element
if(al.size()%2==0)
{
	System.out.println(al.get(al.size()/2));
	System.out.println(al.get(al.size()/2-1));
	
	
}
else
{
	System.out.println(al.get(al.size()/2));
}

//find min And max element

TreeSet<Integer> ts=new TreeSet<Integer>();
ts.addAll(al);
System.out.println(ts.first());
System.out.println(ts.last());


	}
	

}



