package collectionProgram;

import java.util.ArrayList;

public class SumCountAvg {

	public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(304);
al.add(185);
al.add(21);
al.add(1998);
al.add(1);
al.add(16);
al.add(333);;
int sum=0;
for(int i=0;i<al.size();i=i+1)
{
	sum=sum+al.get(i);
	
	
}
System.out.println("Average:"+(sum/al.size()));
System.out.println("sum:"+sum);
System.out.println("count:"+al.size());
	}

}
