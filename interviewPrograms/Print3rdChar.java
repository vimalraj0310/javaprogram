package interviewPrograms;

public class Print3rdChar {

	public static void main(String[] args) {
String s="vimal raj";
char c[]=s.toCharArray();
for(int i=2;i<c.length;i=i+3)
{
	System.out.print(c[i]);
}
	}

}
