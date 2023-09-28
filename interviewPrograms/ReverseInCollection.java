package interviewPrograms;

import java.util.ArrayList;

public class ReverseInCollection {

	public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(5);
al.add(6);
al.add(7);
System.out.print(al);
System.out.println();
for(int i=al.size()-1;i>-1;i--)
{
System.out.print(al.get(i));
}


	}

}
