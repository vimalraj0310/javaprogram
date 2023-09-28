package stringHomeWork;

public class ConvertStringToUpperCase {

	public static void main(String[] args) {
String s="i made my self";
int e=33;
//char d;
char c[]=s.toCharArray();
for(char i:c)
{
	if(i!=' ')
	{
		System.out.println(i);
		e=i-e;
		System.out.print(e);
	}
	//d=(char)e;
	//System.out.println(d);
}

		
	}

}
