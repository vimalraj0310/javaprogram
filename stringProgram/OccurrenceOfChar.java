package stringProgram;

public class OccurrenceOfChar {

	public static void main(String[] args) {
		// Occurrence of char
		String s="java";
		int count=0;
		char c='a';
		for(int i=0;i<s.length();i=i+1)
		{
			if(s.charAt(i)==c)
			{
				count=count+1;
			}
			
		}
System.out.println(count);
	}

}
