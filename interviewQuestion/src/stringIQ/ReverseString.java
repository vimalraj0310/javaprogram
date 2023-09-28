package stringIQ;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Vimal";
char c[]= new char[s.length()];
for(int i=0;i<c.length;i++)
{
	c[i]=s.charAt(i);
	System.out.print(c[i]);
}
System.out.println();

System.out.println();
for(int j=c.length-1;j>=0;j--)
{
	System.out.print(c[j]);
}

	}

}
