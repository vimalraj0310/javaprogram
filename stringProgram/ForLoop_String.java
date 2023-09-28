package stringProgram;

public class ForLoop_String {

	

	public static void main(String[] args) {
String s="alphabet";
//triple for loop to convert ,search and replace
char c[]=new char[s.length()];

//1. this for using for String to Char array convention
for(int i=0;i<s.length();i=i+1)
{
	c[i]=s.charAt(i);
	
}

//2. this for loop using for find word in char array
for(int i=0;i<c.length;i=i+1)
{
	if(c[i]=='a')
	{
		c[i]='@';
	}
		
}
//3.this for loop using for print modified char array
for(int i=0;i<c.length;i=i+1)
{
	System.out.println(c[i]);
}
		
		

System.out.println();
//double for loop for char array convention ,search and replace
String ss="alphabet";
char cc[]=new char[ss.length()];

//1.this for loop using for char array convention ,search and replace
for(int i=0;i<ss.length();i=i+1)
{
	cc[i]=ss.charAt(i);
	if(c[i]=='a')
	{
		
		c[i]='@';
	}
			

}

//2.this for loop using for printing modified char array
for(int i=0;i<cc.length;i=i+1)
{
	System.out.println(cc[i]);
}



//single for loop for char array convention search and replace and printing char array
System.out.println();
String sss="alphabet";
char ccc[]=new char[sss.length()];
//1.only one for loop using for solve char array convention Search and replace and print
for(int i=0;i<sss.length();i=i+1)
{
	ccc[i]=sss.charAt(i);
	if(ccc[i]=='a')
	{
		ccc[i]='@';
	}
	System.out.println(c[i]);
	
}


		
	}

}
