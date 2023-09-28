package arrayIQ;

import java.util.Arrays;

public class CopyAnotherArray {

	public static void main(String[] args) {
int my_array[]= {1,2,3,4,5,6,7,8,9};
int[] new_array=new int[my_array.length];
System.out.println("old Array"+Arrays.toString(my_array));
	for(int i=0;i<my_array.length;i=i+1)
	{
		new_array[i]=my_array[i];
		
	}
	System.out.println("new Array"+Arrays.toString(new_array));
	
	
	}
	

}
