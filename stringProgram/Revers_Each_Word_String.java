package stringProgram;

public class Revers_Each_Word_String {

	public static void main(String[] args) {
	/*	 Write a Java program to reverse each word of a given string?
				 avaJ EE2J PSJ stelvreS etanrebiH sturtS*/
		
		String s="java J2EE JSP Servlets Hibernate Struts";
		String ss[]=s.split(" ");
		for(int i=0;i<ss.length;i=i+1)
		{
		//System.out.println(ss[i]);
		String s1=ss[i];
		char c[]=s1.toCharArray();
		for(int j=c.length-1;j>=0;j=j-1)
		{
			System.out.print(c[j]);
			
			
		}
			
	System.out.print(" ");		
			
			
		}
		
	}

}
