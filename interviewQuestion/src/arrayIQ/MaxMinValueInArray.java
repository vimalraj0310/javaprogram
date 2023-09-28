package arrayIQ;

public class MaxMinValueInArray {

	public static void main(String[] args) {
		int myArray[] = { 23, 55, 66, 22, 11, 33, 66, 88, 99, 76, 54, 32, 57 };
		int max = myArray[0];
		int min = myArray[0];
		for (int i = 0; i < myArray.length; i = i + 1) {
			if(max<myArray[i])
			{
				max=myArray[i];
				
			}
			if(min>myArray[i])
			{
				min=myArray[i];
			}
			
			
		}
System.out.println("maximum number in given array :"+max);
System.out.println("minimum number in given array :"+min);
	}
}
