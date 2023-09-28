package stringProgram;

public class PrintAllChar {

	public static void main(String[] args) {
		// print all characters in a string 
		String s="vimal is good boy";
		for(int i=0;i<s.length();i=i+1)
		{
			System.out.println(s.charAt(i));
		}
		
		// 2nd type for this print all characters
		
		
		String ss="vimal is bad boy";
		
		char c[]=new char[ss.length()];
		for(int i=0;i<c.length;i=i+1)
		{
			c[i]=ss.charAt(i);
			System.out.println(c[i]);

		}
		
		
	}

}
