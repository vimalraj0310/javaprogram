package stringProgram;

public class Count_word_Srch_Word {

	public static void main(String[] args) {
	
	// to count word and search word using flag logic
		
		//1. count word
String str="india is my country";
String c[]=str.split(" ");
System.out.println(c.length);
		
		//2. search word
String srch="my";
boolean flag=false;

	
for(String i:c)
{
	if(i.equals(srch))
	{
		
		flag=true;
	}
	
}
System.out.println(flag);


		
	}

}
