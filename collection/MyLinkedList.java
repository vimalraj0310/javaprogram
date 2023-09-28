package collection;

import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {
LinkedList ll=new LinkedList();
ll.add(5);
ll.add("mango");
ll.add('a');
ll.add(75.0);//to add element in a container
ll.add(true);

System.out.println(ll);//print container
System.out.println(ll.size());//size of container


System.out.println(ll.get(2));//get elements from container

System.out.println(ll.contains("mango"));//to search an elements in container
System.out.println(ll.isEmpty());//to given true /false based on container
ll.set(1,"apple");//To set a value//retain no shift replace elements
System.out.println(ll);
System.out.println(ll.indexOf(75.0));//search index for forward direction
System.out.println(ll.lastIndexOf(75.0));// search index for backward direction
System.out.println(ll.remove(3));//remove element in a container //decrease size of container
System.out.println(ll);
ll.add(1,"orange");// increase size of container
System.out.println(ll);
ll.clear();//to clear our container

	}

}
