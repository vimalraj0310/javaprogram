package collection;

import java.util.ArrayList;

public class MyarrayList {

	public static void main(String[] args) {
try {		
ArrayList<Comparable> al=new ArrayList<Comparable>();
al.add(5);
al.add("mango");
al.add('a');
al.add(75.0);//to add element in a container
al.add(true);

System.out.println(al);//print container
System.out.println(al.size());//size of container


System.out.println(al.get(2));//get elements from container

System.out.println(al.contains("mango"));//to search an elements in container
System.out.println(al.isEmpty());//to giver true /false based on container
al.set(1,"apple");//To set a value
System.out.println(al);
System.out.println(al.indexOf(75.0));//search index for forward direction
System.out.println(al.lastIndexOf(75.0));// search index for backward direction
System.out.println(al.remove(3));//remove element in a container 
al.clear();//to clear our container
System.out.println(al);
}
catch(Exception e)
{
	System.out.println(e);
}

	}

}
