package stringProgram;

public class Search_char {

	public static void main(String[] args) {
		// Search a char in String
		String s="java";
		char srch='a';
		boolean flag=false;
		for(int i=0;i<s.length();i=i+1)
		{
			if(s.charAt(i)==srch)
			{
				flag=true;
			
			}
			
		}
System.out.println(flag);
	}

}
