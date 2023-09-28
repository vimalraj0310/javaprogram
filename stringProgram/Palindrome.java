package stringProgram;

public class Palindrome {

	public static void main(String[] args) {
// palindrome  
		String x="malayalam";
		String y="";
		
		for(int i=x.length()-1;i>=0;i=i-1)
		{
			y=y+x.charAt(i);
			
		}
		
	if(x.equalsIgnoreCase(y))
	{
System.out.println("palindrome");		
	}
	else {
		System.out.println("not palindrome");
	}
		
		
	}

}
