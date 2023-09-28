package interviewPrograms;

public class Print3rdcharNL {

	public static void main(String[] args) {
String s="Anto Antony";
char c[]=s.toCharArray();
for(int i=2;i<c.length;i=i+3)
{
	System.out.println(c[i]);
}
	}

}
