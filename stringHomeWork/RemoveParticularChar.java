package stringHomeWork;

public class RemoveParticularChar {
//3. How to remove a particular character from a string?
	public static void main(String[] args) {
String s="Hi I am doing my work";
char c[]=new char[s.length()];
for(int i=0;i<c.length;i=i+1)
{
	c[i]=s.charAt(i);
}
System.out.println(c);

for(int i=0;i<c.length;i=i+1)
{

	if(c[i]=='i')
	{
		c[i]=' ';
		
	}
	
}
System.out.println(c);
	}
}	

