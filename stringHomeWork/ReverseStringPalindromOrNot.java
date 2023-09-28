package stringHomeWork;

public class ReverseStringPalindromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Amma";
String s1="";
for(int i=s.length()-1;i>=0;i=i-1)
{
	s1=s1+s.charAt(i);
	
}
if(s.equalsIgnoreCase(s1))
{
	System.out.println("palindrom");
}
else
{
	System.out.println("not palindrom");
}
System.out.println(s1);
	}

}
